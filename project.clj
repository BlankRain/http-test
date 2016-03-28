(defproject http-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
  		[org.immutant/immutant "2.1.3"] 
  		[clj-http "2.1.0"]
  		[org.clojure/java.jdbc "0.5.0"]
  		[mysql/mysql-connector-java "5.1.38"]
  		[org.antlr/ST4 "4.0.8"];; string template
  		[lock-key "1.4.1"]
  		 ]
  :main http-test.core
  )
