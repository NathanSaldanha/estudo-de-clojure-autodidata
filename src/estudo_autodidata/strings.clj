(ns estudo-autodidata.strings)

;Para concatenar strings, use str. Clojure não tem interpolação de string. O str trás essa função.
(defn concatenate
  [firs, last]
  (println (str last " " firs)))

(concatenate "Good", "morning")
(println)

;Como muitas outras linguagens, Clojure oferece suporte à formatação de strings com a função format.
;%s é chamado de especificador de formato e especifica o tipo de dados a serem formatados.
;O restante dos argumentos substituirão os especificadores de formato.

;%s é um especificador de formato para string.
(defn format-string [name]
  (format "My favorite fruit is %s" name))
(println (format-string "apple"))
(println)

;%d é um especificador de formato para inteiro.
(defn format-integer [num]
  (format "I ate %d apples" num))
(println (format-integer 2))
(println)

;%.Nf é um especificador de formato para números flutuantes, onde N especifica como os pontos flutuantes devem ser impressos.
(defn format-numbers-floating [num]
  (format "Pi: %.3f" num))
(println (format-numbers-floating 3.14159265))

(defn format-numbers-floating [num]
  (format "Pi: %.5f" num))
(println (format-numbers-floating 3.14159265))