(ns tdd.core-test
  (:require [clojure.test :refer :all]
            [tdd.dollar :refer :all]
            [tdd.franc :refer :all]
            [tdd.money :as m]))

(deftest multiple-test
  (testing "5ドルを2,3倍すれば10ドル・15ドルになる"
    (let [five (->Dollar 5)]
      (is (= (.times five 2) (->Dollar 10)))
      (is (= (.times five 3) (->Dollar 15))))))

(deftest equal-test
  (testing "equal"
    ; clojureはオブジェクト同士を比較できる
    (is (= (->Dollar 5) (->Dollar 5))))

  (testing "compare"
    (is (= (m/compareTo (->Dollar 5) (->Dollar 5)) true))
    (is (= (m/compareTo (->Dollar 6) (->Dollar 6)) true))
    (is (= (m/compareTo (->Fran 6) (->Fran 6)) true))
    (is (= (m/compareTo (->Fran 6) (->Fran 6)) true))
    (is (= (m/compareTo (->Dollar 5) (->Fran 5)) false))))


(deftest fran-multiple-test
  (testing ""
    (let [five (->Fran 5)]
      (is (= (->Fran 10) (.times five 2)))
      (is (= (->Fran 15) (.times five 3))))))

; (run-tests)

