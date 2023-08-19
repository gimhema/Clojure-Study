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

(def vec1 (vector-of :int 9 7 8))
(def vec2 (vector-of :int 4 5 6))
; (println (twoArrayExample vec1 vec2)) 
(println (twoArrayOneWay vec1 vec2))

