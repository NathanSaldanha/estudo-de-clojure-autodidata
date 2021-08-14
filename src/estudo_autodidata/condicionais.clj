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

;Existe também o "case" que funciona praticamente da mesma forma que o de outras linguagens de programação.
;"case" compara o valor com cada condição com "=" e avalia a expressão no ramo correspondente.
(defn case-test-1 [n]
  (case n
    1 "n is 1"
    2 "n is 2"
    "n is other"))

(println (case-test-1 1))
(println (case-test-1 2))
(println (case-test-1 3))

;Quando você deseja fazer algo semelhante, casemas deseja escrever seu próprio caso de teste em vez de =, você pode usar cond.
;Você pode escrever um caso de teste diferente em cada ramo com cond.
;Você usa :else palavra-chave para o caso padrão.
(defn cond-test
  [n]
  (cond
    (= n 1) "n é 1"
    (and (> n 3) (< n 10)) "n é maior que 3 e menor que 10"
    :else "n é outro"))

(println (cond-test 1))
(println (cond-test 5))
(println (cond-test 15))
