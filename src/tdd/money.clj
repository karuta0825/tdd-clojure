(ns tdd.money)

(defprotocol Money
  "Moneyクラスです"
  (times [this multiplier]))

(defn compareTo [m1 m2]
  (if (not= (class m1) (class m2))
    false
    (= (compare (:amount m1) (:amount m2)) 0)))
