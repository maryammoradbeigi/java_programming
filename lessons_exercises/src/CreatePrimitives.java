public class CreatePrimitives {

    public static void main(String[] args) {
        // Creating one primitive without value assignment. The default will be assigned to them.
        boolean result;
        // Creating one primitive and assign value
        double radius = 5;
        double pi = 3.14;
        // Creating multiple variables of same type
        int width, height, area;

        // Creating an array with 12 int
        int[] daysInMonths = new int[12];
        String[] monthNames = {"Jan", "Feb", "Mar", "apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        daysInMonths[0] = 31;
        daysInMonths[1] = 28;
        daysInMonths[2] = 31;
        daysInMonths[3] = 30;
        daysInMonths[4] = 31;
        daysInMonths[5] = 30;
        daysInMonths[6] = 31;
        daysInMonths[7] = 31;
        daysInMonths[8] = 30;
        daysInMonths[9] = 31;
        daysInMonths[10] = 30;
        daysInMonths[11] = 31;

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
        System.out.println(monthNames[0] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[1] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[2] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[3] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[4] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[5] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[6] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[7] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[8] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[9] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[10] + " has " + daysInMonths[0] + " days.");
        System.out.println(monthNames[11] + " has " + daysInMonths[0] + " days.");
    }
}
//// Creating an array of integer with the length of 25
//int[] myIntArray = new int[25];
//// assigning the first element the value 42
//myIntArray[0] = 42;
//
//// Creating an array of integer and assign values to its elements
//int[] myIntArray = {11, 12, 13, 14, 15};
//// Creating an array of strings
//String[] pets = {"Fido", "REx", "Princess"};
//
//// Getting the lengths of array myIntArray and assign it to int x
//int x = myIntArray.length;
