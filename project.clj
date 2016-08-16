(defproject playground "0.1.0-SNAPSHOT"
  :description "Find the square root of a number"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]]
  :main playground.core
  :aot [playground.core])

