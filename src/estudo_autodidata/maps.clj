(ns estudo-autodidata.maps)

;Mapas são estruturas de dados de valores-chave para armazenar vários valores.
(def estrutura-map {:Apple "Mac" :Microsoft "Windows"})
(def nova-estrutura-map [])

;Para obter o valor da chave, use get. Você consegue nil quando a chave não existe.
;Especifiquei um valor padrão no terceiro argumento que será retornado quando a chave não existir no mapa.
(defn pego-valor
  [chave]
  (get estrutura-map chave (str "Sorry, no " chave)))

;Para adicionar um par de valores-chave, use assoc. Se a chave já existe, ela substitui o valor.
(defn adiciono-valor
  [chave valor]
  (assoc estrutura-map chave valor))

;Para juntar dois mapas, use merge.
(defn juntar-valor
  [valor]
  (merge estrutura-map valor))

;Para obter todas as chaves de um mapa, use keys.
(defn pegar-todas-chaves
  [map]
  (keys map))

;Para obter todos os valores de um mapa, use vals.
(defn pegar-todos-valores
  [map]
  (vals map))

(println estrutura-map)
(println (pego-valor :Apple))
(println (adiciono-valor :Commodore "Amiga"))
(println (juntar-valor {:Canonical "Ubuntu"}))
(println (pegar-todas-chaves estrutura-map))
(println (pegar-todas-chaves (juntar-valor {:Canonical "Ubuntu"})))
(println (pegar-todos-valores estrutura-map))
(println (pegar-todos-valores (juntar-valor {:Canonical "Ubuntu"})))