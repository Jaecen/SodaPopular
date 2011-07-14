(ns sodapopular.views.welcome
    (:require [sodapopular.views.common :as common])
    (use noir.core
        hiccup.core
        hiccup.page-helpers))

(defpage "/welcome" []
    (common/layout
        [:h1 "Welcome to SodaPopulist"]
        [:p "Prepare for the democratization of pop distribution"))
