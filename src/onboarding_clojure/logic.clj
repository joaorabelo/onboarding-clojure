(ns onboarding_clojure.logic
  (:require [onboarding_clojure.credit_card :as o.db]))

(println "Listagem de compras:")
(println (-> o.db/cliente
             :cartao
             :compras))

(defn preco-da-compra [compra]
  (:valor compra) )

(defn total-das-compras
  [compras]
  (reduce + (map preco-da-compra compras)))

(defn valor-total-por-categoria
  [[categoria compras]]
  {:categoria       categoria
   :valor-total (total-das-compras compras)})

(println "\n\nValor Total Gasto Por Categoria:")
(println (->> o.db/cliente
    :cartao
    :compras
     (group-by :categoria)
              (map valor-total-por-categoria)))


(println "\n\nBuscando compras pelo estabelecimento:")


(defn compras-por-estabelecimento-ou-valor
  [filtro compra]
  (if ( = (class filtro) java.lang.String)
    (= filtro (:estabelecimento compra))
  (= filtro (:valor compra))))

(defn filtrando-compras
  [filtro compras]
  (filter #(compras-por-estabelecimento-ou-valor filtro %) compras))

(let [compras (-> o.db/cliente
                :cartao
                :compras)]
  (println  (filtrando-compras "Restaurante Code" compras))
  (println  (filtrando-compras "Restaurante" compras))
  (println  (filtrando-compras 250.00 compras)))

