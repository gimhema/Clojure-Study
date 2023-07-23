;; (ns example2)

;; (defn SomeFunction []
  
;;   (def someVal 1)

;;   (def someVal2 2.3)

;;   (def someVal3 "Calc Result : ") 
  
;;   (def someVal4 
;;     (+ someVal someVal2)
;;     ) 
  
;;   (println someVal3 someVal4)

;;   )

;; (SomeFunction)

;; (defn LoopExample []
  
;;   (def x (atom 1))
;;   ( while ( < @x 5) 
;;    (do 
;;      (println "X : " @x)
;;      (swap! x inc)
;;      ) 
;;    ) 
;;   )

;; (LoopExample)


;; (defn DoSeqTest []

;; (println "Do Seq Test")  
;;   (doseq [n [0 1 2 3 4 5]] 
;;     (println n)
;;     )
  
;;   (println "Do Seq Test Use Variable")
;;   (def n2 [0 1 2 3 4 5 6 7 8 9 10])

;;   (doseq [i n2]
;;     (println i)
;;     ) 
;;   )
;; (DoSeqTest)

;; (defn DoTimeTest [] 
;;   (dotimes [n 10]
;;     (println "Do Time Call : " n " Counted")
;;     ) 
;;   )
;; (DoTimeTest)


;; (defn LoopTest []
  
;;   (loop [x 10]
;;     (when (> x 1)
;;       (println x)
;;       (recur (- x 2)) 
;;       ) 
;;     ) 
;;   )
;; (LoopTest)

(defn IfConditionCheck [input]
     (println "If Condition Checking Function .")
  (
   if (= input "Hi")
   (println "Valid Check : " input)
   (println "Invalid Check : " input)
   ) 
  )

;; (IfConditionCheck "Hi")
;; (IfConditionCheck "Hello")

(defn IfDoConditionCheck [x y]
  (println "If Do Condition Checking . .")
  (
   if (= x y)
    (do (println "X : " x " Y : " y)
        (println "X & Y Same"))
    (do (println "X : " x " Y : " y)
        (println "X & Y Diffrent"))
    )
)

;; (IfDoConditionCheck 1 1)
;; (IfDoConditionCheck 1 7)

(defn NestedIfConditionCheck [x y]
  (println "If Nested Condition Checking . .")
  (
   if( and (= x "X") (= y "Y"))
   (do (println "X : " x " Y : " y)
       (println "Check True Nested If Condition"))
   (do (println "X : " x " Y : " y)
       (println "Check False Nested If Condition"))
   ) 
  )

;; (NestedIfConditionCheck "X" "Y")
;; (NestedIfConditionCheck "X" "B")
;; (NestedIfConditionCheck "A" "Y")
;; (NestedIfConditionCheck "A" "B")




