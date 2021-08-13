(ns estudo-autodidata.condicionais)

;O if ecebe um predicado (true ou false) como o primeiro argumento. O segundo argumento será avaliado se o predicado for avaliado como true.
;O terceiro argumento é equivalente a else em muitas linguagens de programação, que é avaliado quando o predicado é avaliado como false.
(if true
  (println "This is always printed")
  (println "This is never printed"))

(if false
  (println "This is always printed")
  (println "This is never printed"))

(defn maior-que-zero [valor]
  (if (> valor 0)
    "verdadeiro"
    "falso"))

(println "Condição maior que zero DESCRITO:" (maior-que-zero -1))

(defn maior-que-zero [valor]
  (> valor 0))

(println "Condição maior que zero SIMPLIFICADO:" (maior-que-zero 1))

;O if-let vincula o resultado da condiçao ao pos-nums, que retorna uma coleção de numeros positivos.
;O segundo argumento é para a outra condição. Ele será avaliado quando o primeiro argumento for avaliado como falso.
(defn positive-number [numbers]
  (if-let [pos-nums (not-empty (filter pos? numbers))]
    pos-nums
    "sem números positivo"))

(println (positive-number [-1 -2 1 2]))