(ns forclojure.f82
  (:require [clojure.set :as cs]))

(def ^:private abjad (concat "abcdefghijklmnopqrs" "tuvwxyz"))

(defn- remove-one
  [sts supset]
  )

(defn- set-based
  [w1 w2]
  (let [sw1 (set w1)
        sw2 (set w2)]
    (or )))

(defn f82
  "A word chain consists of a set of words ordered so that each word differs by only
  one letter from the words directly before and after it.
  The one letter difference can be either an insertion, a deletion, or a substitution.
  Here is an example word chain:cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog.
  Write a function which takes a sequence of words, and returns true if
  they can be arranged into one continous word chain, and false if they cannot."
  [st])
