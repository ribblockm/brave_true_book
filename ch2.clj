;; Clojure and seq abstractions
; can I `first`, `rest` and `cons` it?
; then I can use a seq library with that
; data structure

(comment
  (def sum #(reduce + %))
  (def avg #(/ (sum %) (count %)))
  (defn stats
    [numbers]
    (map #(% numbers) [sum count avg]))
  )