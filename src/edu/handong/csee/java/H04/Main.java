package edu.handong.csee.java.H04;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h04();
    }

    void h04() {
      Scanner s = new Scanner(System.in);
      Random r = new Random();
      int com_finger;
      int my_finger;
      int[][] score = new int[2][3];
      
      do{
        com_finger = r.nextInt(3) + 1;
        System.out.print("Enter Scissors(1) Rock(2) Paper(3) > ");
        my_finger = s.nextInt();

        if(my_finger == 0)
          break;
        System.out.print("What the computer has given out is Scissors ---> ");

        if(my_finger > com_finger){
          if(com_finger == 1 && my_finger == 3){
            System.out.println("Computer win..");
            score[0][0]++;
            score[1][2]++;
          }
          else{
            System.out.println("You win!");
            score[0][2]++;
            score[1][0]++;
          }
        }
        else if(my_finger == com_finger){
          System.out.println("Draw!");
          score[0][1]++;
          score[1][1]++;
        }
        else{
          if(com_finger == 3 && my_finger == 1){
          System.out.println("You win!");
          score[0][2]++;
          score[1][0]++;
          }
          else{
            System.out.println("Computer win..");
            score[0][0]++;
            score[1][2]++;
          }
        }
      }while(my_finger != 0);

      System.out.println("Computer : win - " + score[0][0] + ", lost -  " + score[0][2] + ", draw -  " + score[0][1]);
      System.out.println("User : win - " + score[1][0] + ", lost -  " + score[1][2] + ", draw -  " + score[1][1]);
      

	}
}