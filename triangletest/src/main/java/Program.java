import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Input values");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Triangle triangle = new Triangle();
        int r = triangle.check(x,y,z);
        System.out.println(r);
    }
}
