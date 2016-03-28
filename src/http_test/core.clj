(ns http-test.core   
	(:require  [immutant.scheduling :refer :all]
		   [http-test.sender :as sender]
		   [http-test.dog :as dog]
			))
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn job []
  (println "fire in the hole"))

(defn demo []
(schedule job
  (-> (in 3 :second)
    (every :second)
    (limit 60)))
)

(defn  -main  "" 	[]
	(println "Main 
		in  \"<xml/>
		main")
	#_(demo)
	(println (dog/jdbc-dog))
	(println (sender/str>> "hello ,<name>_  www" {:name "world"}))
	#_(println
		(sender/baidu))
	)
