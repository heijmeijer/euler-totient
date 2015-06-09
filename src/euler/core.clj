(ns euler.core
  (:gen-class)
  (require [clojure.tools.cli :refer [cli]]))

(defn euler-totient-reduce
  [x]
  {:pre [(number? x)]}
  (if (= x 1)
    1
    (reduce #(if (= 1 ((fn gcd
                         [a b]
                         (if (zero? b)
                           a
                           (gcd b (mod a b)))) x %2)
                    ) (inc %) %)
            0
            (range 1 x)
            )))

(defn euler-totient-filter
  [x]
  {:pre [(number? x)]}
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
  )

(defn -main
  "4Clojure: Euler's Totient function"
  [& args]
  )