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

    public Circle() {
        setRadius(1);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.printf("The raidus of circle1 is %s\n", circle1.getRadius());

        // Change the raidus
        circle1.setRadius(5);

        try
        {
            circle1.setRadius(-25);
            System.out.println("An exception has been thrown");
        }
        catch
        {

        }
    }


}

