(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "whowonthecupin"]
  (include-css "/stylesheets/whowonthecupin.css")
  (include-js "/javascript/whowonthecupin.js")]
 [:body
  (eval (:template-body gaeshi.views/*view-context*))
]]