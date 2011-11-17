(defn square [x]
     (* x x)
)

(defn avg [x,y]
     (/ (+ x y) 2.0)
)

(defn improve [g,x]
     (avg g (/ x g))
)

(defn good [g,x]
     (< 
	(Math/abs (- (square g) x)) 
	0.001
     )
)

(defn sqrt
     ([x] 
	(sqrt 1 x)
     )
     ([g,x]
     	(if (good g x) 
		g
     		(sqrt (improve g x) x)
     	)
     )
)
