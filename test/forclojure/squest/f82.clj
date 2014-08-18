(ns forclojure.squest.f82
  (:use [expectations]
        [clojure.set :as cs]))


; 4 Clojure nomer 82

(def abjad (set (concat "abcdefghijklmnopq" "rstuvwxyz")))


(defn f82
  [st]
  true)

; TESTS #2
(comment
(expect true (f82 #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"}))

(expect false (f82 #{"cot" "hot" "bat" "fat"}))

(expect false (f82 #{"to" "top" "stop" "tops" "toss"}))

(expect true (f82 #{"spout" "do" "pot" "pout" "spot" "dot"}))

(expect true (f82 #{"share" "hares" "shares" "hare" "are"}))

(expect false (f82 #{"share" "hares" "hare" "are"}))
)

