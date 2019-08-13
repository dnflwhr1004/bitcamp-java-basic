import java.util.Scanner;

public class Add {

    public static void main(String[] args) {

        System.out.println("첫번째 숫자를 입력하세요.");
        int number1;
        Scanner Scanner = new Scanner(System.in);
        number1 = Scanner.nextInt();

        System.out.println("두번째 숫자를 입력하세요.");

        int number2;
        
        number2 = Scanner.nextInt();

        int number3 = number1 + number2; 

        System.out.println("더한값은" + number3 + "입니다.");



    }

}