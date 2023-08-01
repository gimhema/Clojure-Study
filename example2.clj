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

(defn SwitchExample [x]
  
  (case x 1 (println "Value : 1")
        10 (println "Value : 10")
        (println "Default Area")
        ) 
  )

;; (SwitchExample 1)
;; (SwitchExample 10)
;; (SwitchExample 15)

(defn SwitchCondition [x y]
  
  (cond
    (= x y) (println "X Y Same")
    :else (println "Diffrent . . .")
    ) 
  )

;; (SwitchCondition 1 1)
;; (SwitchCondition 1 2)
;; (SwitchCondition 10 10)

(defn AnonymousFuncTest [] 
  ((fn [x] (+ 5 x)) 3)
  )


(defn FileIOTest [fileName]
  (def _val (slurp fileName))
  (println _val)
  )

;; (FileIOTest "test.txt")

(defn StrTestFormatStr [val]
  (println (format "Hi : %s", val)) 
  )
(defn StrTestFormatInteger [val]
  (println (format "Hi : %d", val)))

;; (StrTestFormatStr "HIHIHI")
;; (StrTestFormatStr 1234)

(defn StrTestTotal [StrVal]
  (println (format "I will show this str count : %d " (count StrVal)))
  (println (subs StrVal 2 5))
  )

;; (StrTestTotal "HiHelloMino")

(defn GetterTest [x]
  (def ret 1)
  (+ ret x) 
  )

(println (format "GetterTest : %d", (GetterTest 1)))










