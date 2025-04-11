public class main1 {

    public static void main(String[] args) {
        // Create objects
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Call methods
        circle.displayShapeType();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.displayShapeType();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.printf("Repot");
    }

}
