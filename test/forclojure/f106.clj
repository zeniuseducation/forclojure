(ns forclojure.f106
  (:use [expectations]))

(def fd (fn [n] (* 2 n)))
(def fh (fn [n] (/ n 2)))
(def fa (fn [n] (+ n 2)))

(def fset [fa fd fh])

(defn- frand
  [n fset]
  (let [num (rand-int 2)]
    {:n num :res ((nth fset num) n)}))

(defn find-path
  [n1 n2]
  (loop [n n1 res [1]]
    (if (= n n2)
        res
        (let [result (frand n1 fset)]
          (recur (:res result)
                 (conj res (:n result)))))))

(defn f106
  "Returns the path from n1 to n2 through
  - double
  - halve
  - add 2"
  [n1 n2]
  (count (find-path n1 n2)))

(expect 1 (f106 1 1))

(expect 3 (f106 12 3))

(expect 3 (f106 3 12))

;; (expect 3 (f106 5 9))

;; (expect 3 (f106 5 9))

;; (expect 5 (f106 9 12))

;; (expect 9 (f106 9 2))
