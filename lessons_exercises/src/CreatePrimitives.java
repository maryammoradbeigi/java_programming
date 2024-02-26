public class CreatePrimitives {

    public static void main(String[] args) {
        // Creating one primitive without value assignment. The default will be assigned to them.
        boolean result;
        // Creating one primitive and assign value
        double radius = 5;
        double pi = 3.14;
        // Creating multiple variables of same type
        int width, height, area;

        // assign values to width, height, area
        width = 8;
        height = 12;
        area = 96;
        result = true;
        System.out.println("The value of width is " + width);
        System.out.println("The value of height is " + height);
        System.out.println("The value of area is " + area);
        System.out.println("The value of radius is " + radius);
        System.out.println("The value of pi is " + pi);
        System.out.println("The value of result is " + result);
    }
}
