(ns estudo-autodidata.sequenciadores)

(def vetores [10 2 3 4 1])

(def vetor-animal ["cat" "dog" "horse"])

;Para aplicar a função de incremento em cada elemento de uma sequência, uso o map.
(defn incrementar-elemento
  [vetor]
  (map inc vetor))

;A maneira como reduce funciona é que primeiro tira os dois primeiros elementos da sequência e aplica a função para obter um resultado.
;Em seguida, aplique a mesma função ao resultado com o terceiro elemento e continue fazendo o mesmo até o final da sequência.
(defn somar-elemento
  [vetor]
  (reduce + vetor))

(defn subtrair-elemento
  [vetor]
  (reduce - vetor))

;Para pegar cada elemento de uma sequência, use doseq. Você pode vincular vários valores.
;Nesse caso, cada elemento do primeiro vetor é adicionado a cada elemento do segundo vetor.
(defn pecorrendo-elemento
  [vetor]
  (doseq [elemento vetor] (println elemento)))

;Pode-se remover os elementos que correspondem à regra especificada em uma sequência filter.
;Aqui está um exemplo para remover números pares e impares de uma sequência.
(defn filtro-pares
  [vetor]
  (filter even? vetor))

(defn filtro-impares
  [vetor]
  (filter odd? vetor))

(println "Incrementando cada elemento:" (incrementar-elemento vetores))
;Utilizando uma função anonima
(println "Incrementando cada elemento funcao anonima:" (map (fn [x] (inc (val x))) {:a 1 :b 2 :c 3}))
(println "Somando cada elemento:" (somar-elemento vetores))
(println "Subtrair cada elemento:" (subtrair-elemento vetores))
(pecorrendo-elemento vetor-animal)
(println "Mostrando apenas numeros pares:" (filtro-pares vetores))
(println "Mostrando apenas numeros impares:" (filtro-impares vetores))