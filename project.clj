(defproject shaving-equipment "0.1.0-SNAPSHOT"
  :description "shaving equipment"
  :url "https://github.com/jpshankle/shaving-equipment"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [scad-clj "0.5.2"]]
  :plugins [[lein-auto "0.1.3"]]
  :main ^:skip-aot shaving-equipment.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
