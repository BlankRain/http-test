;;;;; http sender 
(ns http-test.sender
	(:require [clj-http.client :as client]
		)
	)

(defn  baidu "" [] 
	(client/get "https://baidu.com"))


(defn str>> 
	" template ,model " 
     [t,m]
     (reduce    (fn   [t, k]
     (str (clojure.string/replace  t   (str k)  (str  (get m k))))
	)  ,t ,  (keys m) ))


(defn sb-wx-xml [m]
   (str>> 
 "<xml>
 hello :n
</xml>
   "   (into {} m)))


(defn base64-encode [^String  x]
	(.encodeToString   (java.util.Base64/getEncoder)   (.getBytes x  "utf8"))
	)

(defn base64-decode  [^String x]
	(String. (.decode  (java.util.Base64/getDecoder)  (.getBytes x "utf8"))  "utf8")
	)
