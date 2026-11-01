import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        System.out.print("Enter d: ");
        double d = sc.nextDouble();

        System.out.print("Enter e: ");
        double e = sc.nextDouble();

        System.out.print("Enter f: ");
        double f = sc.nextDouble();

        double det = a * d - b * c;

        if (det == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / det;
            double y = (a * f - e * c) / det;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        sc.close();
    }
}
