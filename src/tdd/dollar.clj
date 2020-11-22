(ns tdd.dollar
  (:require [tdd.money :as m]))

(defrecord Dollar [amount]
  m/Money
  (times [this multiplier]
    (->Dollar (* (:amount this) multiplier))))
