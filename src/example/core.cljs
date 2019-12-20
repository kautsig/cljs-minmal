(ns example.core)

(enable-console-print!)

(prn "hello world!")

(defn print-alert []  
  (js/alert "foo"))

(comment
  (print-alert))
