package dmit2015.model;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    // checked-exception example
//    public void setRadius(double radius) throws Exception {
//        if (radius <= 0) {
//            throw new Exception("Raidus must be a positive non-zero number");
//        }
//        this.radius = radius;
//    }

    // run-time exception example
    public void setRadius(double radius){
        if (radius <= 0) {
           throw new RuntimeException("Raidus must be a positive non-zero number");
       }
        this.radius = radius;
}

public Circle() { setRadius(1);}
}

