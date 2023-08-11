(defn AgentExample []
  (def someVal (agent 0))
  (println someVal)
  )

(AgentExample)

(defn AgentExample2 []
  (def someVal (agent 0))
  (println "Value : " @someVal))

(AgentExample2)

