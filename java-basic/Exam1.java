import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        
        System.out.println("첫번째 숫자 입력");
        a = scanner.nextInt();
        
        System.out.println("두번째 숫자 입력");
        b = scanner.nextInt();

        c = a + b;
        System.out.println(String.format("%d + %d = %d", a,b,c));
        
    }
}