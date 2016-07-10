module the_diff() {
     translate([10,25,-10]) {
          cylinder(h=20, r=4, $fn=6);
     }
}

difference() {
     minkowski() {
          cube([80, 50, 5]);
          cylinder(r=3, $fn=40);
     }
     the_diff();
}

translate([0, -15, 0]) {
     rotate([0,90,0]) {
          cylinder(h=110, r=4.1, $fn=6);
     }
}

translate([0, -60, 0]) {
     difference() {
          cylinder(h=3, r=30);
          union() {
               translate([0, -15, -5]) {
                    cube(32);
               }
               translate([0,
                           0, 0]) {
                    the_diff();
               }
          }
     }
}
