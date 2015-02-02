(ns pwprompt.core
  (:require [pwprompt.utils :refer [read-pass]])
  (:gen-class))

(defn -main
  "Dummy calling wrapper around (read-password) function."
  [& args]
  (println "Start test.")
  (let [pw (pwprompt.utils/read-pass "Enter password: ")]
    (print "Hit 'enter' to continue...")
    (flush);
    (read-line)
    (println)
    (println (str "pw from read-pass '" pw "'"))
  )
  (println "done.")
)
