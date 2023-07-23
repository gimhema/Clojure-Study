(ns example2)

(defn SomeFunction []
  
  (def someVal 1)

  (def someVal2 2.3)

  (def someVal3 "Calc Result : ") 
  
  (def someVal4 
    (+ someVal someVal2)
    ) 
  
  (println someVal3 someVal4)

  )

(SomeFunction)

(defn LoopExample []
  
  (def x (atom 1))
  ( while ( < @x 5) 
   (do 
     (println "X : " @x)
     (swap! x inc)
     ) 
   ) 
  )

(LoopExample)


(defn DoSeqTest []

(println "Do Seq Test")  
  (doseq [n [0 1 2 3 4 5]] 
    (println n)
    )
  
  (println "Do Seq Test Use Variable")
  (def n2 [0 1 2 3 4 5 6 7 8 9 10])

  (doseq [i n2]
    (println i)
    ) 
  )
(DoSeqTest)

(defn DoTimeTest [] 
  (dotimes [n 10]
    (println "Do Time Call : " n " Counted")
    ) 
  )
(DoTimeTest)


