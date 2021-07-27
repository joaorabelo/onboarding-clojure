(ns onboarding_clojure.credit_card)

(def cliente {:nome "Paulo"
              :cpf "545.427.300-77"
              :email "paulo@gmail.com"
              :cartao {:numero 5137516643135932
                       :validade "27/06/2023"
                       :cvv 187
                       :limite 2980}
              })

(println cliente)