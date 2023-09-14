//Homework1.java

import java.util.Scanner;
class Homework1 {
    public static void main(String[] args){
        System.out.println("5개의 정수의 합을 더하겠습니다.");

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.printf("현재까지 입련된 정수의 합은 %d입니다.\n", num1);

        System.out.println("정수를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.printf("현재까지 입련된 정수의 합은 %d입니다.\n", num1 + num2);

        System.out.println("정수를 입력하세요: ");
        int num3 = sc.nextInt();
        System.out.printf("현재까지 입련된 정수의 합은 %d입니다.\n", num1 + num2 + num3);

        System.out.println("정수를 입력하세요:");
        int num4 = sc.nextInt();
        System.out.printf("현재까지 입련된 정수의 합은 %d입니다.\n", num1 + num2 + num3 + num4);

        System.out.println("정수를 입력하세요: ");
        int num5 = sc.nextInt();
        System.out.printf("현재까지 입련된 정수의 합은 %d입니다.", num1 + num2 + num3 + num4 +num5);
    }
}
