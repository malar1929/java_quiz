import java.util.Scanner;
public class java_quiz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int score=0;
        int ans;
        System.out.println("1.what is the capital of india?");
        System.out.println("1.Delhi 2.Mumbai 3.kolkata 4.chennai");
        ans=sc.nextInt();
        if(ans==1){
            score++;
        }
        System.out.println("2.what is national animal of india?");
        System.out.println("1.Triger 2.Lion 3.Tiger 4.Box");
        ans=sc.nextInt();
        if(ans==3){
            score++;
        }
        System.out.println("3.currect cm of tamil nadu?");
        System.out.println("1.joshb viiay 2.jayalalitha 3.mg ramachandran 4.mk stalin");
        ans=sc.nextInt();
        if(ans==1){
            score++;
        }
        System.out.println("Your score is:"+score);
        if(score==3){
            System.out.println("Excellent!");
        }else if(score==2){
            System.out.println("Good");
        }else{
            System.out.println("Better Luck Next Time!");
        }
        sc.close();
    }
}