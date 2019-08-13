import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b, sum, op = 0;
        System.out.println("첫번째 값을 입력하세요.");
        a = scan.nextInt();

        System.out.println("두번째 값을 입력하세요.");
        b = scan.nextInt();

        sum = scan.nextInt();

        System.out.println("연산 종류 선택 : 1. + 2. - 3. * 4. /");
        if(op == 1){
            sum = a + b;
            System.out.println(String.format("%d + %d = %d", a,b,sum));
        }else if(op == 2){
            sum = a - b;
            System.out.println(String.format("%d - %d = %d", a, b, sum));
        }else if(op == 3){
            sum = a * b;
            System.out.println(String.format("%d * %d = %d", a, b, sum));
        }else if(op == 4){
            sum = a / b;
            System.out.println(String.format("%d / %d = %d", a, b, sum));
        }else{}
            System.out.println("입력 값 오류");
    }
}