(ns euler.core
  (:gen-class))

(defn euler-totient-reduce
  [x]
  (if (number? x)
    (if (= x 1)
      1
      (reduce #(if (= 1 ((fn gcd
                           [a b]
                           (if (zero? b)
                             a
                             (gcd b (mod a b)))) x %2)
                      ) (inc %) % )
              0
              (range 1 x)
              ))
    0
    )
  )

(defn euler-totient-filter
  [x]
  (if (number? x)
    (if (= x 1)
      1
      (count (filter #(= 1 ((fn gcd
                              [a b]
                              (if (zero? b)
                                a
                                (gcd b (mod a b)))) x %1)
                         )
                     (range 1 x)
                     )))
    0
    )
  )

(defn -main
  "4Clojure: Euler's Totient function"
  [& args]
  (println (euler-totient-reduce 10))
  (println (euler-totient-filter 50)))
