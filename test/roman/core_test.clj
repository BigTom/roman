(ns roman.core-test
  (:require [clojure.test :refer :all]
            [roman.core :refer :all]))

(deftest simple-addition
  (is (= "II" (add "I" "I")))
  (is (= "VI" (add "V" "I"))) 
  (is (= "XI" (add "X" "I")))
  (is (= "XV" (add "X" "V")))
  )

(deftest subtractive-addition
  (is (= "IIIII" (add "IV" "I")))
  )

(run-tests 'roman.core-test)
