import java.util.Scanner;
import java.util.Arrays;

public class Mini_parking_system{
public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     int[] slot = new int[20];
    

      String ParkingSlot = """
===========================
   PARKING SLOT SERVICE
===========================

Select an option:
1. park on a slot.
2. leave a slot.
3. Display the slot.

""";

while(true){
  System.out.println(ParkingSlot);
  System.out.println("Select an option: ");
  int parkingChoice = input.nextInt();
  
  switch(parkingChoice){
    case 1 ->{
        String menu = """
		==========================
		    AVAILABLE SPACE
		===========================
                """;
	System.out.println(menu);
        for(int row = 0; row < slot.length; row++){
	   if(row == rowInput){
	        continue;
	    }
	    else{
	     System.out.print("Slot " + (row + 1) + " ");
	     System.out.println (slot[row] + "[Available]");
	    }
          }
      }

   case 2 ->{
          String menu = """
                 ============================
		        Occupied space
                 ============================
              """;
	  System.out.print(menu);
	  for(int row = 0; row < slot.length; row++){
               if(row != rowInput){
                  continue;
	        }
                      
               else{
                   System.out.print("slot " + (row - 1) + ": ");
                   System.out.println(slot[row] + "..> [Occupied]");
		}
	     }
           }
        }

      if(usersAnswer == 0){
           break;
   }
  } 





    

}
}			
    

	