(ns forclojure.squest.f89
  (:use [expectations]))

(defn f89
  [gp]
  false)

(expect true (f89 [[:a :b]]))

(expect false (f89 [[:a :a] [:b :b]]))

(expect false (f89 [[:a :b] [:a :b] [:a :c] [:c :a]
              [:a :d] [:b :d] [:c :d]]))

(expect true (f89 [[1 2] [2 3] [3 4] [4 1]]))

(expect true (f89 [[:a :b] [:a :c] [:c :b] [:a :e]
             [:b :e] [:a :d] [:b :d] [:c :e]
             [:d :e] [:c :f] [:d :f]]))

(expect false (f89 [[1 2] [2 3] [2 4] [2 5]]))
