(ns whowonthecupin.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [gaeshi.middleware.view-context :only (wrap-view-context)]
    [gaeshi.views :only (render-template render-html)]
    [gaeshi.controllers :only (controller-router)]))

(defroutes whowonthecupin-routes
  (GET "/" [] (render-template "index"))
  (controller-router 'whowonthecupin.controller)
  (not-found (render-template "not_found" :template-root "whowonthecupin/view" :ns `whowonthecupin.view.view-helpers)))

(def app-handler
  (->
    whowonthecupin-routes
    (wrap-view-context :template-root "whowonthecupin/view" :ns `whowonthecupin.view.view-helpers)))

