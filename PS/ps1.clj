(defn sum [x] (reduce + x))

; (println (sum [1 20 300]) ) 

(defn reduceExample [x] (reduce - x))

; (println (reduceExample [10 5 3]) )

(defn reduceExample2 [x] 
  (reduce * 3 x ) 
  )

; (println (reduceExample2 [1 2 3]) )

(defn twoArrayExample [a b]
  (doseq [elem1 a
          elem2 b] 
    (println "A : " elem1 "B : " elem2)
    )
  )

(defn twoArrayOneWay [a b]
  (def idx (atom 0))
  (doseq [elem1 a]
    (println "A : " (nth a @idx) "B : " (nth b @idx))
    (swap! idx inc)
  )
)

(defn modifyArrat [a]
  
  )

(def vec1 (vector-of :int 9 7 8))
(def vec2 (vector-of :int 4 12 6))
; (println (twoArrayExample vec1 vec2)) 
; (println (twoArrayOneWay vec1 vec2))

(defn compareTwoArray [a b]
  (def idx (atom 0))
  (def _a (atom 0))
  (def _b (atom 0))
  (doseq [x a]
    (cond
      (> (nth a @idx) (nth b @idx)) (swap! _a inc)
      (< (nth a @idx) (nth b @idx)) (swap! _b inc)
      )
    (swap! idx inc)
    )
  [@_a @_b]
  )

(println (compareTwoArray vec1 vec2))


