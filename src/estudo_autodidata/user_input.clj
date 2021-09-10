(ns estudo-autodidata.user_input)


(println "X =" (let [A (read-line)
                     B (read-line)]
                 (+ (Integer/parseInt A) (Integer/parseInt B))))
