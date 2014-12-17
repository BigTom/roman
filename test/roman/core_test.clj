(ns roman.core-test
  (:require [clojure.test :refer :all]
            [roman.core :refer :all]))

(deftest simple-addition
  (is (= "II" (add "I" "I"))))

(run-tests 'roman.core-test)
