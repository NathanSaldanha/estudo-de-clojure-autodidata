(ns estudo-autodidata.functions)

;Defn
;O primeiro argumento é o nome da função say-hello, o segundo argumento é o argumento da função [name]
;e o terceiro argumento é o corpo da função (println (str "Hello, " name))
(defn say-hello
  [name]
  (println (str "Hello, " name)))
(say-hello "nathan0")

;Função Anônima
;passando de uma função para uma função, retornado de uma função e vinculando a uma variável
(def hello-world-func (fn [] (say-hello "nathan1")))
(hello-world-func)

(def hello-world-func (fn [func name] (func name)))
(hello-world-func say-hello "Nathan2")

;Closure
;Quando uma função é retornada de outra função,
;e a função interna faz alguma coisa com os argumentos fornecidos pela função externa,
;então a função interna é chamada de closure .
(defn inner
  [from-outer]
  (fn [] (say-hello from-outer)))

(def outer1 (inner "nathan3"))
(def outer2 (inner "nathan4"))

(outer1)
(outer2)