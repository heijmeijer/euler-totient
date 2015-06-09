(ns euler.core-test
  (:require [clojure.test :refer :all]
            [euler.core :refer :all]))

(deftest euler-totient-reduce-test
  (testing "euler-totient-reduce"
    (are [n answer] (= answer (euler-totient-reduce n))
                    () nil
                    nil nil
                    0 0
                    1 1
                    10 (count '(1 3 7 9))
                    40 16
                    (range 1 10) nil)
                    ))

(deftest euler-totient-filter-test
  (testing "euler-totient-filter"
    (are [n answer] (= answer (euler-totient-filter n))
                    () nil
                    nil nil
                    0 0
                    1 1
                    10 (count '(1 3 7 9))
                    40 16
                    (range 1 10) nil
                    )))