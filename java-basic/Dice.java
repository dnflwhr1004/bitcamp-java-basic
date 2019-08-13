import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         * 주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다.
         * 일단 컴퓨터가 던져서 얻은 값은 3입니다. 
         * 사용자는 입력을 홀수 인거 같으면 '홀' 을 선택, 나머지는 '짝' 선택 
         * 한다고 할때, 결과를 출력하세요.  
         */
        
         System.out.println("선택해주세요.");
         String op = "";
         op = scan.next();
         if(op.equals("홀")){
             System.out.println("홀수입니다.");
        }else if(op.equals("짝")){
             System.out.println("틀렸습니다.");
        }else{
            System.out.println("잘못선택 되었습니다.");
        }
    }
}