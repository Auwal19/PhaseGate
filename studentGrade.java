import java.util.Scanner;
import java.util.Arrays;

public class studentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many Student do you have: ");
        int numberOfStudent = input.nextInt();

        System.out.print("How many subject do they offer: ");
        int numberOfSubject = input.nextInt();

        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        int[][] totalScore = new int[numberOfStudent][numberOfSubject];
        System.out.println(Arrays.deepToString(totalScore));

        collectScore(input, totalScore, numberOfStudent, numberOfSubject);

        displayScore(totalScore, numberOfStudent);

        calculateTotalAndAverage(totalScore, numberOfStudent, numberOfSubject);

        input.close();
    }


    public static void collectScore(Scanner input, int[][] totalScore, int numberOfStudent, int numberOfSubject) {

        for (int index = 0; index < numberOfStudent; index++) {

            for (int count = 0; count < numberOfSubject; count++) {

                System.out.println("For Student " + (index + 1));

                System.out.print("Enter score for subject " + (count + 1) + ":");

                int score = input.nextInt();

                while (score < 0 || score > 100) {

                    System.out.print("invalid");
                    score = input.nextInt();

                }

                totalScore[index][count] = score;
            }
        }
    }


    public static void displayScore(int[][] totalScore, int numberOfStudent) {

        for (int index = 0; index < numberOfStudent; index++) {

            System.out.println("Student" + (index + 1) + ": "
                    + Arrays.toString(totalScore[index]));

        }
    }


    public static void calculateTotalAndAverage(int[][] totalScore, int numberOfStudent, int numberOfSubject) {

        int[] StudentTotalScore = new int[numberOfStudent];

        for (int index = 0; index < numberOfStudent; index++) {

            int total = 0;

            for (int count = 0; count < numberOfSubject; count++) {

                total += totalScore[index][count];
            }

            StudentTotalScore[index] = total;

            double average = total / numberOfSubject;

            System.out.println("Student" + (index + 1) + "Total" + ": " + total);

            System.out.println("Student" + (index + 1) + "Average" + ": " + average);
        }
    }
}