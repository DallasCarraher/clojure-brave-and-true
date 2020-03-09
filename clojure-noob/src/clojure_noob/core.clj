(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!")
  (if true  
    (do (println "Success!")
      "By Zeus's hammer!")
    (do (println "Failure!")
      "By Aquaman's trident!"))
  (when true
    (println "when is a combination of if and do but with no else condition"))
  (println(nil? nil))
  (nil? 1))

(defn -equality
  "this is another method"
  [& args]
  (println(= 1 1))
  (println(= nil nil))
  (= 1 2))

(defn -equality2
  "this is another method"
  [& args]
  (or false nil :large_I_mean_venti :why_cant_I_just_say_large)
  (println "or returns either the first truthy value or the last value. and returns the first falsey value or, if no values are falsey, the last truthy value")
  (and :free_wifi :hot_coffee))

(defn -variables
  "this is another method"
  [& args]
  (def failed-protagonist-names
    ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])
  failed-protagonist-names)
  
  
  

