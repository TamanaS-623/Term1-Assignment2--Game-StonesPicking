/* 
 * Student Name : Tamana Seddiqi
 *  Student ID : 991528861
 *  Program Description : Java program to code a GAME  for picking stones being played between user and computer where the computer choice is according  
 *                                   to number of remaining stones and the computer always wins 
 */

// Scanner input
import java.util.Scanner;

public class GameStonesPicking
{
  public static void main( String[] arg)
  {
    //Scanner initialisation
    Scanner input = new Scanner(System.in);
    
    //Declaration and initialisation of Variables
    int TotalStones = 21;
    int UserNumber, ComputerNumber;
    int RemainingStones = TotalStones;
    
    do
   {
      // do-while loop if the usernumber is greater than 3 OR remaing stones
    do{
          System.out.println(" Number of stones remaining : "+ RemainingStones);
          System.out.print(" User picks : ");
          UserNumber = input.nextInt();  
          
          // Check whether UnserNumber is greater than 3
          if(UserNumber > 3) 
          {
               System.out.println(" Invalid choice .... please select between (1 - 3) \n");
          }
          
          //check whether UserNumber is greater than remaining number of stones
          else if(RemainingStones < UserNumber)
          {
              System.out.println(" Invalid choice!.... your number is greater than the remaining number of stones .... Please try again! \n");
          }   
       }while((UserNumber > 3 ) || (UserNumber > RemainingStones));
       
       // Count the number of remaining stones does its user pick
       RemainingStones = RemainingStones - UserNumber;
         
     
       //if Condition to check number of remainig stones should not zero
       if(RemainingStones > 0)
       {
         //Check if total remianing stones is 3 
        if( RemainingStones ==  3)
        {
            System.out.println(" Computer picks : "+ (ComputerNumber = 2 ));
         }
        
        //check if total remaning stones is 2
        else if( RemainingStones ==  2)
        {
           System.out.println(" Computer picks : " + (ComputerNumber = 1));
        }
          
       //Check if the remainder 4 of remaining stones is 0
        else  if( RemainingStones %4 == 0) 
       {
           System.out.println(" Computer picks : " + (ComputerNumber = 3 ));
       }
 
        //Check if the remainder 4 of remaining stonesis not zero
       else
      {
          ComputerNumber = (RemainingStones % 4) -1;
          System.out.println(" Computer picks : " + ComputerNumber );
      }
     
       //Count number of remaining stones after computer does its pick
       RemainingStones = RemainingStones -  ComputerNumber;
       System.out.println();
       
    }
 }while((RemainingStones<= TotalStones) && ( RemainingStones >0));
    
  System.out.print("Oops! User lost the game ");
 }
}