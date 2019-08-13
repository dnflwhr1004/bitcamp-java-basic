import java.util.Scanner;
import java.util.Random;
public class Dice2 {
      /**
         * 주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다.
         * 일단 컴퓨터가 던져서 얻은 값은 3입니다. 
         * 사용자는 입력을 홀수 인거 같으면 '홀' 을 선택, 나머지는 '짝' 선택 
         * 한다고 할때, 결과를 출력하세요.  
         */
    public static void main(String[] args) {
        System.out.println("선택해주세요.");
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
         int dice = 0;
         dice = ran.nextInt(6)+1;
         System.out.println(String.format("랜덤으로 나온 수 %d", dice));
         String dap = "";

         if(dice==1){
             dap = "홀";
         }else if(dice == 2){
             dap = "짝";
         }else if(dice == 3){
             dap = "홀";
         }else if(dice == 4){
             dap = "짝";
         }else if(dice == 5){
             dap = "홀";
         }else{
             dap = "짝";
         }
         System.out.println("주사위 값을 예측한 홀, 짝 입력[  ]");
         String op = "";
         op = scan.next();
         if(op.equals(dap)){
             System.out.println("정답입니다.");
         }else if(!op.equals(dap)){
         System.out.println("틀렸습니다.");
         }else{
             System.out.println("잘못 선택하셨습니다.");
         }
    }
}