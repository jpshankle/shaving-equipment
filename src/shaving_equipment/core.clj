(ns shaving-equipment.core
  (:gen-class)
  (require [scad-clj.scad :refer :all]
           [scad-clj.model :refer :all]))

(defn bowl
  "a bowl to hold shave soap"
  []
  (difference
    (->>
     (cylinder 45 30)
     (with-fs 1)
     (with-fa 1))
    (->>
     (sphere 40)
     (with-fs 1)
     (with-fa 1)
     (translate [0 0 32]))))

(defn -main
 "creates scad files for the equipment"
 [& args]
 (spit "dist/bowl.scad"
   (write-scad
     (bowl))))
