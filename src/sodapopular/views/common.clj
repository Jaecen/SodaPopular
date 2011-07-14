(ns sodapopular.views.common
    (use noir.core
        hiccup.core
        hiccup.page-helpers))

(defpartial layout [& content]
    (html5
        [:head
            [:title "sodapopular"]
            (include-css "/css/reset.css")
            (include-css "/css/site.css")]
        [:body
            [:div#wrapper
                content]]))