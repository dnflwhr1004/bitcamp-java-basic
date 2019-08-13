import java.util.Scanner;

public class WhereLive {
    public static void main(String[] args) {
    
        System.out.println("어디사세요?");
        String area = "";

        Scanner scanner = new Scanner(System.in);
        area = scanner.next();

        System.out.print(String.format("나는 %s 삽니다", area));

    }
}