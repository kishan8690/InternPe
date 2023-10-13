import java.util.Random;
import java.util.Scanner;
public class Task2StonePaperScissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StonePaperScissor s = new StonePaperScissor();
        String again = "yes";
        while(again.equals("yes")){
            s.play();
            System.out.println("want to play again?");
            again=scan.nextLine();
        }
    }
}
class StonePaperScissor{
    String generateString(){
        Random r = new Random();
        int randomNumber = r.nextInt(3);
        String[] op = {"stone","paper","scissor"};
        return op[randomNumber]; 
    }
    void play(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice stone,paper or scissor");
        String input = sc.nextLine();
        System.out.println();
        String temp = generateString();
        if(input.equals("stone") && temp.equals("scissor")){
            win();
        }
        else if(input.equals("scissor") && temp.equals("stone")){
            loose();
        }
        else if(input.equals("stone") && temp.equals("stone")){
           equal();
        }
        else if(input.equals("stone") && temp.equals("paper")){
            loose();
        }
        else if(input.equals("paper") && temp.equals("stone")){
            win();
        }
        else if(input.equals("paper") && temp.equals("paper")){
            equal();
        }
        else if(input.equals("scissor") && temp.equals("paper")){
            win();
        }
        else if(input.equals("paper") && temp.equals("scissor")){
            loose();
        }
        else if(input.equals("scissor") && temp.equals("scissor")){
            equal();
        }
        else{
            System.out.println("Invalid input");
        }
    }
    void win(){
        System.out.println("win!!!!!");
    }
    void loose(){
        System.out.println("loose... better luck next time");
    }
    void equal(){
        System.out.println("...Try again...");
    }
}