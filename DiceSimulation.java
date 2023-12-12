/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dicesimulation;


import java.util.Random;   // Needed for the Random class

/**
   This class simulates rolling a pair of dice 10,000 times
   and counts the number of times doubles of are rolled for
   each different pair of doubles.
*/


public class DiceSimulation {

   
    public static void main(String[] args) {
        
        
       final int NUMBER = 10000;  // Number of dice rolls

      // A random number generator used in
      // simulating the rolling of dice
      

      int dice1Value;       // Value of the first dice
      int dice2Value;       // Value of the second dice
      int count = 0;       // Total number of dice rolls
      int snakeEyes = 0;   // Number of snake eyes rolls  // if both dices has number 1
      int twos = 0;        // Number of double two rolls    // if both dices has number 2
      int threes = 0;      // Number of double three rolls   // if both dices has number 3
      int fours = 0;       // Number of double four rolls   // if both dices has number 4
      int fives = 0;       // Number of double five rolls  // if both dices has number 5
      int sixes = 0;       // Number of double six rolls   // if both dices has number 6

      // TASK #1 Enter your code for the algorithm here
      
    Random generator = new Random();
        
    
   for ( count=0; count<NUMBER; count++ )
        {
          dice1Value = generator.nextInt(6) +1;
          dice2Value = generator.nextInt(6) +1;
          
          if (dice1Value == dice2Value)
          {
              if( dice1Value == 1 )
                  snakeEyes ++;
              else if( dice1Value == 2 )
                  twos ++;
              else if( dice1Value == 3 )
                  threes ++;
              else if( dice1Value == 4 )
                  fours ++;
              else if( dice1Value == 5 )
                  fives ++;
               else if ( dice1Value == 6 )
                  sixes ++;
          }      
        }       
            
//    while (count < NUMBER )
//    {    
//     
//        dice2Value = generator.nextInt(6)+1;
//        dice2Value = generator.nextInt(6)+1;
//       
//        if (dice1Value == dice2Value)
//        {
//           if( dice1Value == 1 )
//               snakeEyes ++;
//           else if( dice1Value == 2 )
//               twos ++;
//           else if( dice1Value == 3 )
//               threes ++;
//           else if( dice1Value == 4 )
//               fours ++;
//           else if( dice1Value == 5 )
//               fives ++;
//           else if ( dice1Value == 6 )
//               sixes ++;
//        }
//        
//        count ++;
//    }
            
      // Display the results
      System.out.println ("You rolled snake eyes " +
                          snakeEyes + " out of " +
                          count + " rolls.");
      System.out.println ("You rolled double twos " +
                          twos + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double threes " +
                          threes + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double fours " +
                          fours + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double fives " +
                          fives + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double sixes " +
                          sixes + " out of " + count +
                          " rolls.");
   }
}