import java.util.Scanner;

public class Area_of_Shapes {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What shape do you have, Rectangle, Triangle or Circle? If you have Rectangle input 1, For Triangle input 2 and for circle input 3.");
        int shape = scanner1.nextInt();
        if (shape < 4 && shape > 0) {
            if (shape == 1) {
                System.out.println("You have selected 'Rectangle' Shape.");
            } else if (shape == 2) {
                System.out.println("You have selected 'Triangle' Shape.");
            } else {
                System.out.println("You have selected 'Circle' Shape.");
            }
        } else {
            System.out.println("You did not select any shape correctly");
            System.out.println(" ==== ---- Come again with correct Shape, Bye !---- ====");
        }
        if (shape == 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the radius of a circle in cm.");
            double rad = scanner.nextDouble();
            double crcl = circle(rad);
            System.out.println("Area of Circle: " + crcl + " sqr.cm");
        }
        if (shape == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the Base of Triangle in cm.");
            double base = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Please enter the Height of Triangle in cm.");
            double height = scanner.nextDouble();
            double trngl = triangle(base, height);
            System.out.println("Area of Triangle is: " + trngl + " sqr.cm");
        }
        if (shape == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the Length of Rectangle in cm.");
            double length = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Please enter the Width of Rectangle in cm.");
            double width = scanner.nextDouble();
            double rectgl = rectangle(length, width);
            System.out.println("Area of Triangle is: " + rectgl + " sqr.cm");
        }
    }
    public static double circle(double a) {
        return 3.14 * a * a;
    }
    static double rectangle(double a, double b) {
        return a * b;
    }
    static double triangle (double a, double b){
        return 0.5*a*b;
    }

}