
public class comparism {
    public static void main(String[] args) {

        int[][] number = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        sortNumbers(number);
        displayNumbers(number);
    }

    public static void sortNumbers(int[][] number) {
        for (int index = 0; index < number.length; index++) {
            for (int index1 = 0; index1 < number.length; index1++) {
                for (int count = index1 + 1; count < number[index].length; count++) {
                    if (number[index][index1] < number[index][count]) {
                        int change = number[index][index1];
                        number[index][index1] = number[index][count];
                        number[index][count] = change;
                    }
                }
            }
        }
    }

    public static void displayNumbers(int[][] number) {
        for (int index = 0; index < number.length; index++) {
            for (int count = 0; count < number[index].length; count++) {
                System.out.print(number[index][count] + " ");
            }

            System.out.println();
        }
    }
}
