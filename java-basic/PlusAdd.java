import java.util.Scanner;

public class PlusAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a,b,c,op = 0;
        System.out.println("첫번째 숫자를 입력해주세요.");
        a = scan.nextInt();

        System.out.println("두번째 숫자를 입력해주세요.");
        b = scan.nextInt();       
       
        System.out.println("연산종류를 선택하세요 1.+ 2.- 3.* 4./");
        op = scan.nextInt();

        if(op==1){
            c = a + b;
            System.out.println(String.format("%d + %d = %d", a, b, c));
        }else if(op==2){
            c = a - b;
            System.out.println(String.format("%d - %d = %d", a, b, c));
        } else if(op==3){
            c = a * b;
            System.out.println(String.format("%d * %d = %d", a, b, c));
        } else if(op==4){
            c = a / b;
            System.out.println(String.format("%d / %d = %d", a, b, c));
        } else{
            System.out.println("값이없습니다.");
        }     
    }
}