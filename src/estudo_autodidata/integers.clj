(ns estudo-autodidata.integers)

;Adição
(println (+ 2 3))
;Subtração
(println (- 10 3))
;Multiplicação
(println (* 10 2))
;Divisão
(println (/ 4 2))
(println (/ 4 3))
;Modulo
(println (mod 3 2))
;Maior numero de uma lista
(println (max 1 2 3 4 5))
;Menor numero de uma lista
(println (min 5 4 3 2 1))
;Clojure não fornece função integrada para operação exponencial.
(defn power
  [x n]
  (reduce * (repeat n x))
  )
(println (power 2 3))
