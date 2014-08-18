(ns forclojure.f106
  (:use [expectations]))

(def fd (fn [n] (* 2 n)))
(def fh (fn [n] (/ n 2)))
(def fa (fn [n] (+ n 2)))

(def fset [fa fd fh])

(defn- gen-path
  "Generate [paths] number of paths each with [entries] number of entries"
  [paths entries]
  (loop [n 0 res []]
    (if (= n paths)
        res
        (recur (inc n)
               (conj res (loop [m 0 rslt []]
                           (if (= m entries)
                             rslt
                             (recur (inc m)
                                    (conj rslt
                                          (rand-int 2))))))))))

(defn- path-sol?
  [path n1 n2]
  (if (= n1 n2)
      1
      (if (empty? path)
          999
          (if (= n2 ((nth fset (first path)) n1))
              2
              (+ 1 (path-sol? (rest path)
                              ((nth fset (first path)) n1)
                              n2))))))

(defn- paths-sol
  [paths]
  (loop [cp paths res []]
    (if (empty? paths)
        res
        (recur (rest cp)
               res))))

(defn f106
  "Returns the path from n1 to n2 through
  - double
  - halve
  - add 2"
  [n1 n2]
  )

;; (expect 1 (f106 1 1))

;; (expect 3 (f106 12 3))

;; (expect 3 (f106 3 12))

;; (expect 3 (f106 5 9))

;; (expect 3 (f106 5 9))

;; (expect 5 (f106 9 12))

;; (expect 9 (f106 9 2))
