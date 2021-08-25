(ns estudo-autodidata.sequenciadores)

(def vetores [1 2 3 4])

;Para aplicar a função de incremento em cada elemento de uma sequência, uso o map.
(defn incrementar-elemento
  [vetor]
  (map inc vetor))

(defn somar-elemento
  [vetor]
  (reduce + vetor))

(println "Incrementando cada elemento:" (incrementar-elemento vetores))
;Utilizando uma função anonima
(println "Incrementando cada elemento funcao anonima:" (map (fn [x] (inc (val x))) {:a 1 :b 2 :c 3}))
(println "Somando cada elemento:" (somar-elemento vetores))