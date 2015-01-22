(ns forclojure.squest.f119
  (:require [expectations :refer :all]))

(defn f119
  [x mat]
  true)


(expect (f119 :x [[:o :e :e] 
                  [:o :x :o] 
                  [:x :x :e]])
        #{[2 2] [0 1] [0 2]})

(expect (f119 :x [[:x :o :o] 
                  [:x :x :e] 
                  [:e :o :e]])
        #{[2 2] [1 2] [2 0]})

(expect (f119 :x [[:x :e :x] 
                  [:o :x :o] 
                  [:e :o :e]])
        #{[2 2] [0 1] [2 0]})

(expect (f119 :x [[:x :x :o] 
                  [:e :e :e] 
                  [:e :e :e]])
        #{})

(expect (f119 :o [[:x :x :o] 
                  [:o :e :o] 
                  [:x :e :e]])
        #{[2 2] [1 1]})

