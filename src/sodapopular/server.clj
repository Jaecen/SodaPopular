(ns sodapopular.server
  (:require [noir.server :as server]))

(server/load-views "src/sodapopular/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer/parseInt (System/getenv "PORT"))]
    (server/start port {:mode mode
                        :ns 'sodapopular})))

