(ns forclojure.arie741.f72
	(use [expectations]))

(defn f72
	[x]
	(reduce + x))



(= (f72 (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
	 (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (f72))
	 11)

(defn f32
	[a b]
	(take (- b a) (iterate inc a)))

(= (f32 1 4) '(1 2 3))

(= (f32 -2 2) '(-2 -1 0 1))

(= (f32 5 8) '(5 6 7))

(defn f33 [a b]
	(flatten (map #(repeat b %) a)))