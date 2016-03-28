;;; data dog..
;;;get data from datasource
;;;; jdbc dog
(ns http-test.dog
	(:require  [clojure.java.jdbc :as jdbc])
	)
(def  datasource 
	{:subprotocol "mysql"
               :subname "//127.0.0.1:3306/cnopencart"
               :user "root"
               :password "YuqiongKLM"}
	)
(defn jdbc-dog " get data from jdbc  " []
	(jdbc/query  datasource ["select 123 as 'hello'  union select 2 "])
	)