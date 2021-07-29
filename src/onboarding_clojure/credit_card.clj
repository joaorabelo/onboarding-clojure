(ns onboarding_clojure.credit_card)
(use 'java-time)

(def cliente {:nome "Paulo"
              :cpf "545.427.300-77"
              :email "paulo@gmail.com"
              :cartao {:numero 5137516643135932
                       :validade (local-date-time 2022 05 18 0 00)
                       :cvv 187
                       :limite 2980
                       :compras [{:data (local-date-time 2021 07 18 0 00)
                                 :valor 50.00
                                 :estabelecimento "Restaurante Code"
                                 :categoria "Alimentação"}
                                 {:data (local-date-time 2021 07 19 8 00)
                                  :valor 730.00
                                  :estabelecimento "Restaurante Code"
                                  :categoria "Alimentação"}
                                 {:data (local-date-time 2021 07 29 8 00)
                                  :valor 150.00
                                  :estabelecimento "Edu Pay"
                                  :categoria "Educação"}
                                 {:data (local-date-time 2021 06 29 8 00)
                                  :valor 1205.00
                                  :estabelecimento "Edu Pay"
                                  :categoria "Educação"}
                                 {:data (local-date-time 2021 06 15 9 00)
                                  :valor 250.00
                                  :estabelecimento "Hospital A"
                                  :categoria "Saúde"}
                                 {:data (local-date-time 2021 05 29 8 00)
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
