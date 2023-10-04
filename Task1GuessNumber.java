import java.util.Scanner;
public class Task1GuessNumber{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GGame g = new GGame();
        g.guessTheNumber();    
    }
}
class GGame{
    int n;
    private static int count=1;
    void guessTheNumber(){
        Scanner sc=new Scanner(System.in);
        String play="yes";
        while(play.equals("yes")){
                n=(int)((Math.random()*99)+1);
                System.out.println("guss the number:");
                int number=sc.nextInt();
                while(true){
                if(number>n){
                    System.out.println("Enter Lesser value than "+number); //printing previous input
                    number=sc.nextInt();
                    count++;
                }
                else if(number<n){
                    System.out.println("Enter Greater value than "+number);//printing previous input
                    number=sc.nextInt();
                    count++;
                }
                else if(number==n){
                    System.out.println();
                    System.out.println();
                    System.out.println("Congratulation!!! you won it take only "+count+" guesses");
                    break;
                }
                else{
                    System.out.println("Error");
                    break;
                }   
            }
            count=1;
            System.out.println("\nDo you want to continue? Enter yes or no");
            play=sc.next();
        }
    }
}