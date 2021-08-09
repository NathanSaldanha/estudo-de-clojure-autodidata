;Dar nomes a valores é chamado de atribuição em muitas linguagens de programação.
; No entanto, chamamos o mapeamento entre nomes e valores de vinculação em Clojure.

(ns estudo-autodidata.bindings)

;O let é usado para vincular valores a nomes,
;pegamos um vetor que leva um símbolo o "l e d" no primeiro elemento e um valor no segundo elemento "light e darkness".
;Não se pode resolver o símbolo fora do let. Esse comportamento é muito semelhante à variável privada em outras linguagens de programação.
(let [l "light"
      d "darkness"]
  (println (str "God said let there be " l))
  (println (str "God also said let there be " d)))

; Também pode vincular símbolos a valores com def.
; Embora você possa acessar o símbolo apenas de dentro de let onde ele está declarado,
; você pode acessar o símbolo declarado com def de qualquer lugar.

(def object "darkness")
(println (str "God said let there be " object))

(def object
  (let [l "light"] l))
(println (str "God said let there be " object))

