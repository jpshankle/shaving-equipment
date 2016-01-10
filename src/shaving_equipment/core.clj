(ns shaving-equipment.core
  (:use [scad-clj.scad])
  (:use [scad-clj.model]))

(defn bowl
  "A shaving bowl"
  []
  (def bowlprim
    (difference
     (->>
      (cylinder 45 30)
      (with-fs 1)
      (with-fa 1))
     (->>
      (sphere 40)
      (with-fs 1)
      (with-fa 1)
      (translate [0 0 32]))
     ))
  (spit "bowl.scad" (write-scad bowlprim)))

(defn buildObjects
  "Take all the shaving equipment and make it openscad files"
  []
  (bowl))
