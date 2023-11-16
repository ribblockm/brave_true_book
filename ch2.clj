;; Clojure and seq abstractions
; can I `first`, `rest` and `cons` it?
; then I can use a seq library with that
; data structure

(comment
  ; here we are using map over a vector of functions
  ; which is pretty nice
  (def sum #(reduce + %))
  (def avg #(/ (sum %) (count %)))
  (defn stats
    [numbers]
    (map #(% numbers) [sum count avg]))
  )

;; The following are some examples that would
; fit perfectly to what I have in mind for building
; a command-line json processor, similar to jq

(comment
  (def identities
    [{:alias "Batman" :real "Bruce Wayne"}
     {:alias "Spider-Man" :real "Peter Parker"}
     {:alias "Santa" :real "Your mom"}
     {:alias "Easter Bunny" :real "Your dad"}])
  
  (reduce (fn [new-map [key val]]
            (assoc new-map key (inc val)))
          {}
          {:max 30 :min 10})
  
  (reduce (fn [new-map [key val]]
            (if (> val 4)
              (assoc new-map key val)
              new-map))
          {}
          {:human 4.1
           :critter 3.9})
  )