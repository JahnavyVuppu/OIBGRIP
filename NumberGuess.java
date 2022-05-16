import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args){
        int HiddenNumber,Guess,choice;
        Random random= new Random();
        HiddenNumber=random.nextInt(101);
        System.out.println("HIDDEN NUMBER : " +HiddenNumber);
        System.out.println("ENTER YOUR NAME:");
        Scanner sc=new Scanner(System.in);
        String Name=sc.nextLine();
        System.out.println("Hi "+ Name+"!!\nLET'S GET STARTED....");
        System.out.println("\nGuess The Number between 0 to 100");
        System.out.println("You have 7 guesses");
        int turns=1;
        boolean play=true;
        while(play){
            System.out.print("\nGuess the number : ");
            Guess=sc.nextInt();
            if(Guess>100 || Guess<0){
                System.out.println("Invalid Guess. Hidden Number range is between 0 to 100");
            } 
            else if(Guess>HiddenNumber){
            System.out.println("Too High");
            }
            else if(Guess<HiddenNumber){
                System.out.println("Too Low");
            }
            else if(Guess==HiddenNumber)
            {
            System.out.println("Congrats!! You are RIGHTT.....\nYou guessed the number in "+turns+" attempts..");
            System.out.println("1.Replay\n2.Exit");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                    play=true;
                    HiddenNumber=random.nextInt(101);
                    System.out.println("Random number is "+HiddenNumber);
                    System.out.println("You have 7 guesses");
                    turns=1;
                    break;
                    case 2:
                    play=false;
                }
                continue;
            }
            turns++;
            if(turns==8){
                System.out.println("Your 7 turns are over");
                System.out.println("1.Replay\n2.Exit");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                    play=true;
                    HiddenNumber=random.nextInt(101);
                    System.out.println("Random number is "+HiddenNumber);
                    System.out.println("You have 7 guesses");
                    turns=1;
                    break;
                    case 2:
                    play=false;
                }
                continue;
            }
        }
        System.out.println("Thanks for Playing!!");
        sc.close();
    }    
}
