(ns estudo-autodidata.listas)

(def lista '(1 2 3))

(defn adiciono-a-list
  [num]
  (conj lista num))

(defn posicao-valor
  [posicao]
  (nth lista posicao))

(println "lista" (adiciono-a-list 4))
(println "valor da posiçao 2:" (posicao-valor 2))