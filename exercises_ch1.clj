(comment
  (defn plus-100
    [n]
    (+ n 100))
  )

(comment
  (defn dec-maker
    [dec-by]
    #(- % dec-by))
  
  (def dec9 (dec-maker 9))
  (dec9 10)
  )