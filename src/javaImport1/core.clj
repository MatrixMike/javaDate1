(ns javaImport1.core
	(:gen-class )
)

(import [java.util Date Random])


 (Date. (long (.nextInt (Random.))))  ;; is this a definition?
 
 
(defn -main [& args]
   (def n (long (.nextInt (Random.))))
   (println (long (.nextInt (Random.))))
   (println n)
   (println (Date. (long (.nextInt (Random.)))))
   (println (Date. n))
)


;;  produces #inst "1970-01-04T14:55:16.377-00:00"
