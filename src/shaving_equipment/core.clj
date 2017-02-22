(ns shaving-equipment.core
  (:gen-class)
  (require [scad-clj.scad :refer :all]
           [scad-clj.model :refer :all]))

(defn outerBowl
  "the outer part of the shave bowl"
  []
  (->>
   (cylinder 45 35)
   (with-fs 1)
   (with-fa 1)))

(defn innerBowl
  "the inner part of the shave bowl"
  []
  (->>
   (cylinder 42 40)
   (with-fs 1)
   (with-fa 1)
   (translate [0 0 10])))

(defn bowl
  "a bowl to hold shave soap"
  []
  (difference
    (outerBowl)
    (innerBowl)))

(defn -main
 "creates scad files for the equipment"
 [& args]
 (spit "dist/bowl.scad"
   (write-scad
     (bowl))))
