(ns clj-telehash-e3x.core
  (:import (com.neilalexander.jnacl.crypto curve25519xsalsa20poly1305)))

(def csids [:3a])

(defn generate-keypair []
  (let [sk (byte-array curve25519xsalsa20poly1305/crypto_secretbox_SECRETKEYBYTES)
        pk (byte-array curve25519xsalsa20poly1305/crypto_secretbox_PUBLICKEYBYTES)]
    (curve25519xsalsa20poly1305/crypto_box_keypair pk sk)
    {:key (into [] pk) :secret (into [] sk)}))

;; generate:
(comment
  Each cipher set needs to be able to generate a key pair.
  )

(comment
  (def p (generate-keypair))
  (type (first (:key p)))
  )










