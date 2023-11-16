;; fun use of futures
(comment
  (defn print-number-and-wait
    [n]
    (println n " gatinhas")
    (Thread/sleep 200))
  
  (def f
    (future
      (run! (var print-number-and-wait)
            (range))))
  
  (future-cancel f)
  )

;; book ch 1
;; you'll use literals in operations
;; (operator operand1 operand2 ...)

;; control flow
(comment
  (if true
    (do (println "success!")
        "zeus hammer")
    (do (println "failure")
        "netuno trident"))
  
  (if false
    (do (println "success!")
        "zeus hammer")
    (do (println "failure")
        "netuno trident"))
  
  (if nil
    (do (println "success!")
        "zeus hammer")
    (do (println "failure")
        "netuno trident"))
  
  ; or returns either first thuthy value
  ; or last value
  ; and returns first falsey else last truthy
  (or false nil :ricky :barana)
  (or false nil :barana)
  (and nil false :ricky)
  (and :ricky false :barana)
  (and :ricky :barana)
  )

;; data structures
(comment
  ; you can treat a map as a function and
  ; a keyword as an argument
  ({:nome "ricky" :altura 1.85} :altura)
  ; or you can treat a keyword as a function
  ; that look up the value in a data structure
  (:nome {:nome "ricky" :altura 1.85})
  (:peso {:nome "ricky" :altura 1.85} "undefined")

  ;; vectors or lists?
  ; to look up a value, better do with vectors
  ; when using lists, you go one value at a time
  )

;; functions
(comment
  (defn two-params
    [x y]
    (str "Two parameters! That's nothing! Pah! I will smoosh them "
         "together to spite you! " x y))
  
  ;; this is very cool
  ; arity overloading
  (defn x-chop
    "Describe the kind of chop you're inflicting on someone"
    ([name chop-type]
     (str "I " chop-type " chop " name "! Take that!"))
    ([name]
     (x-chop name "karate")))
  
  (defn announce-treasure-location
    [{:keys [lat lng]}]
    (println (str "Treasure lat: " lat))
    (println (str "Treasure lng: " lng)))
  
  ;; closures
  (defn inc-maker
    "Create a custom incrementor"
    [inc-by]
    #(+ % inc-by))
  
  (def inc3 (inc-maker 3)) 
  )