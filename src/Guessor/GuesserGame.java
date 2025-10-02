package Guessor;

import java.util.Scanner;

class Guesser{
    int GuesserNumb; // instance variable
    public int getGuesserNumb(){
        GuesserNumb = (int)(Math.random()*10);
        return GuesserNumb;
    }
}

class Player{
    int playerNumb;
    public int getPlayerNumb(){
        Scanner sc = new Scanner(System.in);
        playerNumb = sc.nextInt();
        return playerNumb;
    }
}

class Umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void collectNumFromGuesser(){
        Guesser Gnum = new Guesser();
        Guessernum = Gnum.getGuesserNumb();
    }

    // get magic number for print after game completion
    public int getMagicNumber(){
        return Guessernum;
    }

    public void collectNumFromPlayer(){

        System.out.println("Player 1 Guess a Number");
        Player P1num = new Player();
        Playernum1 = P1num.getPlayerNumb();

        System.out.println("Player 2 Guess a Number");
        Player P2num = new Player();
        Playernum2 = P2num.getPlayerNumb();

        System.out.println("Player 3 Guess a Number");
        Player P3num = new Player();
        Playernum3 = P3num.getPlayerNumb();
    }


    public void Compare(){
        if(Guessernum==Playernum1){
            if(Guessernum==Playernum2){
                if (Guessernum==Playernum3){
                    System.out.println("All Player Won");
                }
                else System.out.println("Player 1 & Player 2 Won");
            }
            else if(Guessernum == Playernum3){
                System.out.println("Player 1 & Player 3 Won");
            }
            else System.out.println("Player 1 Won");
        }

        else if(Guessernum==Playernum2){
            if(Guessernum==Playernum3){
                System.out.println("Player 2 & Player 3 Won");
            }
            else System.out.println("Player 2 Won");
        }

        else if(Guessernum==Playernum3){
            System.out.println("Player 3 Won");
        }
        else System.out.println("All Player Lost");
    }


}


public class GuesserGame {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("------ Game Started -----");
            Umpire u1 = new Umpire();
            u1.collectNumFromGuesser();
            u1.collectNumFromPlayer();
            u1.Compare();
            int magic = u1.getMagicNumber();
            System.out.println("Magic NUmber : " + magic);
            System.out.println("You want to Exits game : Y | N");
            System.out.println("Select Y for Yes | N for No");
            String terminate = sc.nextLine();
            if(terminate.equals("Y")){
                System.out.println("---- Game Over -----");
                break;
            }
            System.out.println();
        }
    }
}
