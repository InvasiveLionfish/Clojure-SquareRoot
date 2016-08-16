(ns playground.core 
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))

(defn sqrt [x] 
  (cond 
    (< x 0) 
    (print x "is negative and its square root is" (math/sqrt (* x -1))"i")
    (> x 0) 
    (print x "is positive and its square root is" (math/sqrt x))
    (= x 0) 
    (print x "is zero and its square root is" (math/sqrt x)))
  (println)
 )

(defn -main[& args]
  "Command-line entry point."
  []
  (println "Hello, EPX! Using math libraries makes calculating square roots pretty easy.")
  (println)
  (sqrt 25)
  (sqrt 32)
  (sqrt 0)
  (sqrt 1.0)
  (sqrt -4)
  (println)
  (println "Now you try! Invoke the sqrt function with an argument in the Leiningrad REPL."))
