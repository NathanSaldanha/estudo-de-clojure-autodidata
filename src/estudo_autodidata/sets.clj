(ns estudo-autodidata.sets)

;Você pode criar um conjunto agrupando valores com #{}. Observe que a ordem dos valores não é mantida.
;Você receberá uma exceção ao tentar armazenar um valor duplicado. Neste caso, 3é valor duplicado.
;(println #{1 2 3 3})
(def conjunto #{1 2 3})

(def conjunto-novo #{1 5})

(defn adiciono-a-conjunto
  [num]
  (conj conjunto num))

;Para criar um conjunto onde um valor é removido (basicamente removendo um valor do conjunto), use disj(disj [oin]).
;Se tentar um valor que não existe no conjunto, ele retorna o conjunto original.
(defn removo-valor
  [num]
  (disj conjunto num))

(defn ondenar
  [num]
  (sort (conj conjunto num)))

;Para verificar se um valor está contido no conjunto, use a funçao contains?
(defn contem-valor?
  [num]
  (contains? conjunto num))

;Para verificar se um conjunto faz parte de outro conjunto
(defn subconjunto?
  [conj1 conj2]
  (clojure.set/subset? conj1 conj2))

;Para verificar se um conjunto inclui outro conjunto
(defn superconjunto?
  [conj1 conj2]
  (clojure.set/superset? conj1 conj2))

(println "Conjunto:" conjunto)
(println "Adiciono valor ao conjunto:" (adiciono-a-conjunto 4))
(println "Adiciono valor do conjunto:" (removo-valor 3))
(println "Ordenar valor do conjunto:" (ondenar 4))
(println "Contem o valor no conjunto?" (contem-valor? 3))
(println "Conjunto faz parte do outro conjunto?" (subconjunto? conjunto-novo conjunto))
(println "Conjunto inclui outro conjunto?" (subconjunto? conjunto-novo conjunto))
