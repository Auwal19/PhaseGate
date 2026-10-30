import java.util.Scanner;
import java.util.Arrays;
public class studentGrade{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("How many Student do you have: ");
    int numberOfStudent = input.nextInt();

    System.out.print("How many subject do they offer: ");
    int numberOfSubject = input.nextInt();
   
    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Saved successfully");
 
    int[][] totalScore = new int[numberOfStudent][numberOfSubject];
    System.out.println(Arrays.deepToString(totalScore));

    for(int index = 0; index < numberOfStudent; index++){
        for(int count = 0; count < numberOfSubject; count++){
          System.out.println("For Student " + (index + 1));
	  System.out.print("Enter score for subject " + (count + 1)+ ":");
          int score = input.nextInt();
           
           while(score < 0 || score > 100){
             System.out.print("invalid");
	     score = input.nextInt();
           
           System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>");
             System.out.println("Saved successfully");
           }
          }
            totalScore[index][count] = scores;
    	 }
      
      System.out.println("=====================================");
      System.out.print("           SUBJECT SUMMARY");
      System.out.println("=====================================");

      int Highest = 0;
      int lowest = 0;
       

       
      
         
     

     
     


    


}
}       
    

    
 

    

    

    


    

    
    
    