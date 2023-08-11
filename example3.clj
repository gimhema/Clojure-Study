(defn AgentExample []
  (def someVal (agent 0))
  (println someVal)
  )

; (AgentExample)

(defn AgentExample2 []
  (def someVal (agent 0))
  (println "Value : " @someVal))

; (AgentExample2)

(defn SendAgentExample []
  (def someVal (agent 0))
  (println "Value : " @someVal)
  (send someVal + 50)
  (println "Value : " @someVal)
  (shutdown-agents)
  )

(SendAgentExample)



