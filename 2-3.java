import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Задані натуральне число n та дійсне число x. ");
		int n;
        do {
            System.out.print("Введіть натуральне число n: ");
            n = in.nextInt();

            if(n <= 0) {
				System.out.println("Введене число не є натуральним.");
			}
        }
        while (n <= 0);

        System.out.print("Введіть дійсне число x: ");
        float x = in.nextFloat();

		float sum = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                sum += x+j/i;
            }
        }
		
        System.out.printf("Сума: %.2f\n", sum);
    }
}