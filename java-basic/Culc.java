import java.util.Scanner;

public class Culc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a,b,c = 0;
        System.out.println("첫번째 숫자를 입력해주세요.");
        a = scan.nextInt();

        System.out.println("두번째 숫자를 입력해주세요.");
        b = scan.nextInt();       
       
        String op = "";

        System.out.println("연산종류를 선택하세요 +, -, *, /");
        op = scan.next();

        if(op.equals("+")){
            c = a + b;
            System.out.println(String.format("%d + %d = %d", a, b, c));
        }else if(op.equals("-")){
            c = a - b;
            System.out.println(String.format("%d - %d = %d", a, b, c));
        } else if(op.equals("*")){
            c = a * b;
            System.out.println(String.format("%d * %d = %d", a, b, c));
        } else if(op.equals("/")){
            c = a / b;
            System.out.println(String.format("%d / %d = %d", a, b, c));
        } else{
            System.out.println("값이없습니다.");
        }     
    }
}