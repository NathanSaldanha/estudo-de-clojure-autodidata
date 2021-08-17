(ns estudo-autodidata.vetores)

(def vetor [1 2 3])

(defn adiciono-a-vetor
  [num]
  (conj vetor num))

(defn posicao-valor
  [posicao]
  (nth vetor posicao))

(defn firs-valor [vetores]
  (first vetores))

(defn second-valor [vetores]
  (second vetores))

(defn last-valor [vetores]
  (last vetores))

(defn indice [num]
  (.indexOf vetor num))

(println "lista" (adiciono-a-vetor 4))
(println "valor da posiçao 2:" (posicao-valor 2))
(println "Primeiro valor:" (firs-valor vetor))
(println "Segundo valor:" (second-valor vetor))
(println "Ultimo valor:" (last-valor vetor))
(println "Posição do valor:" (indice 3))