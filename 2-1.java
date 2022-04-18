import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Обчислення значень функції:");

        do {
            try {
                System.out.print("Введіть x: ");
                int x = in.nextInt();
                System.out.print("Введіть y: ");
                int y = in.nextInt();
                System.out.print("Введіть z: ");
                int z = in.nextInt();
                
				float res = x*x*y-14*z;
				
				if(res < 0) throw new ArithmeticException("Число в корені меньше 0");

                System.out.printf("Результат: %.2f\n", Math.sqrt(res));
                break;
            }
            catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
        } while (true);
    }
}
