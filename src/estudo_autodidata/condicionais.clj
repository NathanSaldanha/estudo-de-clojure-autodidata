(ns estudo-autodidata.condicionais)

;ifrecebe um predicado ( trueou false) como o primeiro argumento. O segundo argumento será avaliado se o predicado for avaliado como true.
;O terceiro argumento é equivalente a else em muitas linguagens de programação, que é avaliado quando o predicado é avaliado como false.
(if true
  (println "This is always printed")
  (println "This is never printed"))

(defn positive-number [numbers]
  (if-let [pos-nums (not-empty (filter pos? numbers))]
    pos-nums
    "no positive numbers"))

(positive-number-seq [-1 -2])