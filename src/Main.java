import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];

        Random random = new Random();

        for (int i = 0; i < dataPoints.length; i++)                                       //array with random values
        {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {                                     // puts | in between the random numbers
            System.out.print(dataPoints[i]);
            if (i != dataPoints.length - 1) {
                System.out.print("|");
            }
        }

    int sum = 0;                                                                          //start calculate sum and average

    for (int i = 0; i < dataPoints.length; i++){
        sum += dataPoints[i];
    }
    double average = (double) sum / dataPoints.length;

        System.out.println("\n\nThe sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f", average);//end output for sum and average

        System.out.println();                                                           //line space

        Scanner scanner = new Scanner(System.in);

        int userValue = SafeInput.getRangedInt(scanner, "Enter a number between 1 and 100: ", 1, 100);  //START prompt user for a number

        int count = 0;

        for (int i = 0; i <dataPoints.length; i++){                         //counting how many times the number appears
            if (dataPoints[i] == userValue){
                count++;

            }
        }
        System.out.println("\nThe user's value (" + userValue + ") was found " + count + " times in the array."); //END prints how many times the user's number appears



        boolean found = false;                          //START searching for the user's number in the array and telling where the first instance is
        for (int i = 0; i < dataPoints.length; i++)
        {   if (dataPoints[i] == userValue)
          {
            System.out.println("\nThe value " + userValue + " was found first found in array index " +i); //when its found
            found = true;
            break;
          }
        }
        if (!found)
        {
            System.out.println("\nThe value " + userValue + " was not found in the array."); //END if it's not found
        }

        int min =dataPoints[0];                                                         //START finding the min and max numbers in the array
        int max =dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {                                   //find min
            if (dataPoints[i] < min){
                min = dataPoints[i];
            }
            if (dataPoints[i] > max){                                                   //find max
                max = dataPoints[i];
            }
        }
        System.out.println("\nThe minimum value in the dataPoints array is: " + min);
        System.out.println("\nThe maximum value in the dataPoints array is: " + max);   //END output for min and max

        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints));

    }
    public static double getAverage(int[] values)
    {
        int sum = 0;
        for (int value : values)
        {
            sum += value;
        }
        return (double) sum / values.length;
    }

}