(ns tdd.franc
  (:require [tdd.money :as m]))

(defrecord Fran [amount]
  m/Money
  (times [this multiplier]
    (->Fran (* (:amount this) multiplier))))



