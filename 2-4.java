import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a = -6;
        float b = 3;
        float dx = 0.75f;

        System.out.println("\tx\t|\t\ty");
        System.out.println("—————————————————————————");
        for(float x = a; x <= b; x+=dx) {
            System.out.printf("%.2f\t|\t", x);
			System.out.printf("%.3f\n", Math.pow(x,4) - 12*x + Math.pow(Math.E, x));
        }
    }
}
