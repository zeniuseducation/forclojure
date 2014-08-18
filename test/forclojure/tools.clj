(ns forclojure.tools
  (:require [couchbase-clj.client :as cc]
            [com.ashafa.clutch :as cl]))

;; Just in case you need a database access
;; (cc/defclient cb {:bucket "playground" :uris ["http://127.0.0.1:8091/pools"]})

;; This is an online actual database in cloudant

(def cdb "http://zenius.cloudant.com/party-animals")







