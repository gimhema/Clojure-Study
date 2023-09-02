(defn ps2 [a b]
  (def idx 0)
  (doseq [n a]
    
    )
  )

;; (defn NestedIfConditionCheck [x y]
;;   (println "If Nested Condition Checking . .")
;;   (if (and (= x "X") (= y "Y"))
;;     (do (println "X : " x " Y : " y)
;;         (println "Check True Nested If Condition"))
;;     (do (println "X : " x " Y : " y)
;;         (println "Check False Nested If Condition"))))


(defn CalcSum [ar]
  (reduce
   (fn [val ar] (+ val ar))
   0
   ar))


(defn PNZ [arr]

  (def size (atom 0))
  (def pPostive (atom 0))
  (def pNegative (atom 0))
  (def pZero (atom 0))

  (doseq [a arr]
    (swap! size inc)
    (cond
      (> a 0) (swap! pPostive inc)
      (< a 0) (swap! pNegative inc)
      (= a 0) (swap! pZero inc))
    ) 
  [(float (/ @pPostive @size)) (float (/ @pNegative @size)) (float (/ @pZero @size))]
)

(println (PNZ [4 -1 2 3 0 -5])) 