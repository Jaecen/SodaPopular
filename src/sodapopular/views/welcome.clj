(ns sodapopular.views.welcome
  (:require [sodapopular.views.common :as common]
            [noir.content.pages :as pages])
  (use noir.core
       hiccup.core
       hiccup.page-helpers))

(defpage "/welcome" []
    (common/layout
        [:h1 "Welcome to sodapopular"]
        [:p "Prepare for the democratization of carbonated libation"]))
