(ns onboarding_clojure.credit_card)

(def cliente {:nome "Paulo"
              :cpf "545.427.300-77"
              :email "paulo@gmail.com"
              :cartao {:numero 5137516643135932
                       :validade "27-06-2023"
                       :cvv 187
                       :limite 2980
                       :compras [{:data "27-07-2021"
                                 :valor 50.00
                                 :estabelecimento "Restaurante Code"
                                 :categoria "Alimentação"}
                                 {:data "27-07-2021"
                                  :valor 730.00
                                  :estabelecimento "Restaurante Code"
                                  :categoria "Alimentação"}
                                 {:data "27-07-2021"
                                  :valor 150.00
                                  :estabelecimento "Edu Pay"
                                  :categoria "Educação"}
                                 {:data "27-07-2021"
                                  :valor 1205.00
                                  :estabelecimento "Edu Pay"
                                  :categoria "Educação"}
                                 {:data "27-07-2021"
                                  :valor 250.00
                                  :estabelecimento "Hospital A"
                                  :categoria "Saúde"}
                                 {:data "28-07-2021"
                                  :valor 150.99
                                  :estabelecimento "Hospital B"
                                  :categoria "Saúde"}
                                 ]}
              })

(println "cliente:")
(println cliente)

(println "compras:")
(println (-> cliente
             :cartao
             :compras))
