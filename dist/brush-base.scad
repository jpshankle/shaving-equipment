difference () {
  minkowski () {
    cube ([80, 50, 5], center=true);
    cylinder ($fn=40, h=1, r=3, center=true);
  }
  translate ([15, 0, 0]) {
    cylinder ($fn=6, h=10, r=5, center=true);
  }
}
