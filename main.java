public class Main {
    public static void main(String[] args) {
        // Create a circle instance
        Circle circle = new Circle(3.5);

        // Get circle details
        System.out.println(circle.getRadius());                  // Output: 3.5
        System.out.println(circle.calculateArea());              // Output: 38.48451000647496
        System.out.println(circle.calculateCircumference());     // Output: 21.991148575128552

        // Try to set an invalid value
        circle.setRadius(-2.0);                                  // Throws IllegalArgumentException: Radius must be a positive number.
    }
}
