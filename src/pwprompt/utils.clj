(ns pwprompt.utils
  (:import [jline.console ConsoleReader])
  (:gen-class))

(defn read-pass [ promptStr ]
  (let [cr (ConsoleReader.)]
    (.readLine cr promptStr \* )
  )
)
