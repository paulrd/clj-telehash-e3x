(ns clj-telehash-e3x.core-test
  (:require [clojure.test :refer :all]
            [clj-telehash-e3x.core :refer :all]
            [telehash-packet.core :as pack]))

(deftest e3x
  (testing "generates keys"
    (let [pair (generate-keypair)]
      (is (= (count (:key pair)) 32)))))

