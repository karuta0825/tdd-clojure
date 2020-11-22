(ns tdd.core
  (:gen-class))

(defrecord Dollar [amount])
(defrecord Fran [amount])

(defmulti mtimes (fn [entity multiplier] (class entity)))

(defmethod mtimes Dollar [entity multiplier]
  (->Dollar (* (:amount entity) multiplier)))

(defmethod mtimes Fran [entity multiplier]
  (->Fran (* (:amount entity) multiplier)))

(mtimes (->Dollar 5) 2)
(mtimes (->Fran 5) 2)



;; これを共通のmethodとしてつかいたいわけですね。
;; クラスを分けるのがよい




(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
