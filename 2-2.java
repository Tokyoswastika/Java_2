import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добуток чисел кратних 3 у діапазоні [10 60]:");
		int dob = 1;
        for(int i = 10; i <= 60; i++) {
            if(i % 3==0)
                dob*=i;
        }
        System.out.println("Цикл for: "+ dob);


		dob =1;
        int i = 10;
        while(i <= 60) {
            if(i % 3==0)
                dob*=i;
            i++;
        }
        System.out.println("Цикл while: " + dob);
		dob = 1;
        i = 10;
        do {
            if(i % 3 == 0)
                dob*=i;
            i++;
        } while(i <= 60);
        System.out.println("Цикл do...while: " + dob);
    }
}
