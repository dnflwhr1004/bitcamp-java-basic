/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */

 import java.util.Scanner;
 import java.util.Random;

 public class Rock{
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        String u = "";
        int c = 0;

        System.out.println("가위~바위~보!");

     
        u = scan.next();
        c = ran.nextInt(3)+1;

        
        if(c == 1){
            System.out.println("가위");
        }else if(c == 2){
            System.out.println("바위");
        }else{
            System.out.println("보");
        }

     


        if(c == 1){
               
        if(u.equals("가위")){
            System.out.println("비겼습니다.");
        }else if(u.equals("보")){
            System.out.println("졌습니다.");
        }else{
            System.out.println("이겼습니다.");
        }
    }
        if(c == 2){    
        
        if(u.equals("가위")){
        System.out.println("졌습니다.");
        }else if(u.equals("보")){
            System.out.println("이겼습니다.");
        }else{
            System.out.println("비겼습니다.");
        }
    }
        if(c == 3){
              
        if(u.equals("가위")){
            System.out.println("이겼습니다.");
        }else if(u.equals("보")){
            System.out.println("비겼습니다.");
        }else{
            System.out.println("졌습니다.");
           }
        } 
    }
}