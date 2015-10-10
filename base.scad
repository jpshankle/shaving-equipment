//shaving brush base
difference () {
    cube([80,50,5]);

    translate([10,25,-1])
        cylinder (h=20, r=3.1, $fn=6);
}