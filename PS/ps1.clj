(defn sum [x] (reduce + x))

; (println (sum [1 20 300]) ) 

(defn reduceExample [x] (reduce - x))

; (println (reduceExample [10 5 3]) )

(defn reduceExample2 [x] 
  (reduce * 3 x ) 
  )

(println (reduceExample2 [1 2 3]) )

