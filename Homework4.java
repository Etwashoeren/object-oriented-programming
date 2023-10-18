import java.util.Scanner;
class GcdByDivision{
    int gcd(int m, int n) {
        if(m == 0) {return m;}
        else if((m % n) == 0) {return n;}
        else{
            return gcd( m % n , m);
        }
    }
}
public class Homework4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int num = sc.nextInt();
        GcdByDivision gcd = new GcdByDivision();
        System.out.println("두 수의 최대 공약수는 " + gcd.gcd(num, num) + "입니다.");
    }


}

