(ns forclojure.squest.f178
  (:use [expectations]))

(def raw-rank "23456789TJQKA")
(def raw-suit "HCDS")

(def refs (->> (mapcat #(list %1 %2)
                       raw-rank
                       [1 2 3 4 5 6 7 8 9 10 11 12 13])
               (apply hash-map)))

(defn rank [st]
  (get refs (first st)))

(defn suit [st]
  (second st))

(defn ranks [hands]
  (->> (map rank hands)
       (sort)
       (reverse)))

(def pair? (fn [hands]
             (let [groups (frequencies (ranks hands))
                   ptype (count groups)]
               (if (= 5 ptype)
                   :high-card
                   (if (= 4 ptype)
                       :pair
                       (if (= 3 ptype)
                           (if (some #(= (second %) 3)
                                     groups)
                               :three-of-a-kind
                               :two-pair)
                           (if (some #(= (second %) 4)
                                     groups)
                               :four-of-a-kind
                               :full-house)))))))

(defn flush? [hands]
  (apply = (map #(second %) hands)))

(defn straight? [hands]
  (let [groups (sort (ranks hands))]
    (= groups
       (take 5 (iterate inc (first groups))))))

(defn f178 [raw-hand]
  (let [hands (map reverse raw-hand)]
    (if (straight? hands)
        (if (flush? hands)
            :straight-flush
            :straight)
        (if (flush? hands)
            :flush
            (pair? hands)))))

(expect :high-card (f178 ["HA" "D2" "H3" "C9" "DJ"]))


(expect :pair (f178 ["HA" "HQ" "SJ" "DA" "HT"]))


(expect :two-pair (f178 ["HA" "DA" "HQ" "SQ" "HT"]))


(expect :three-of-a-kind (f178 ["HA" "DA" "CA" "HJ" "HT"]))


(expect :straight (f178 ["HA" "DK" "HQ" "HJ" "HT"]))


(expect :straight (f178 ["HA" "H2" "S3" "D4" "C5"]))


(expect :flush (f178 ["HA" "HK" "H2" "H4" "HT"]))


(expect :full-house (f178 ["HA" "DA" "CA" "HJ" "DJ"]))


(expect :four-of-a-kind (f178 ["HA" "DA" "CA" "SA" "DJ"]))


(expect :straight-flush (f178 ["HA" "HK" "HQ" "HJ" "HT"]))
 
