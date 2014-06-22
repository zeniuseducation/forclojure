; 4 Clojure nomer 82


; TESTS #2

(= true (f82 #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"}))

(= false (f82 #{"cot" "hot" "bat" "fat"}))

(= false (f82 #{"to" "top" "stop" "tops" "toss"}))

(= true (f82 #{"spout" "do" "pot" "pout" "spot" "dot"}))

(= true (f82 #{"share" "hares" "shares" "hare" "are"}))

(= false (f82 #{"share" "hares" "hare" "are"}))


; TESTS #1

(= true (f82 #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"}))

(= false (f82 #{"cot" "hot" "bat" "fat"}))

(= false (f82 #{"to" "top" "stop" "tops" "toss"}))

(= true (f82 #{"spout" "do" "pot" "pout" "spot" "dot"}))

(= true (f82 #{"share" "hares" "shares" "hare" "are"}))

(= false (f82 #{"share" "hares" "hare" "are"}))
