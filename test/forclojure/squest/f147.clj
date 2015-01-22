(ns forclojure.squest.f147
  (:use [expectations]))

(defn f147 [col]
  (let [fp (fn fp
             ([col] (if (= 1 (count col)) [(first col) (last col)]
                                          (cons (first col) (fp col 0) )))
             ([col n] (if (= (- (count col) 1) n) [(last col)]
                                                  (cons (+ (nth col n) 0N (nth col (inc n))) (fp col (inc n)) ))))]
    (cons col (lazy-seq (f147 (fp col))))))

(comment 
  (expect (take 100 (f147 [2 4 2])) (rest (take 101 (f147 [2 2]))))

  (expect (take 2 (f147 [3 1 2])) [[3 1 2] [3 4 3 2]])

  (expect (take 5 (f147 [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])

  (expect (take 5 (f147 [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]))
