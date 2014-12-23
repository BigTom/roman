(ns roman.core
  (:require [clojure.string :as str])
  (:gen-class))

(def unpacker {"IV" "IIII" "IX" "VIIII"})

(defn unpack [n]
  (loop [c n
         k (keys unpacker)]
    (if (empty? k)
      c
      (recur 
        (str/replace c (first k) (unpacker (first k))) 
        (rest k)))))

(defn add [a b]
  (str (unpack a) (unpack b)))
