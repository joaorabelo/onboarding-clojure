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

(defn compras-no-estabelecimento
  [compra]
  (= "Restaurante Code" (:estabelecimento compra) ))

(let [compras (-> o.db/cliente
                :cartao
                :compras)]
  (println "filter" (filter compras-no-estabelecimento compras))
  )