import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] dataPoints = new int[100];
        int sum =0;
        double average;
        Random rnd = new Random();
        int userChoice;
        int countValue =0;
        boolean withinArray = false;
        int min =101;
        int max =0;

        for(int l =0 ; l < dataPoints.length; l++)
        {
           dataPoints [l] = rnd.nextInt(100)+1;
        }

	    for(int l:dataPoints)
        {
            System.out.print(l +" | ");
        }
        for (int l : dataPoints)
        {
            sum += l;
        }
        average = (double) sum / dataPoints.length;
        System.out.println("\nThe sum of the random array, dataPoints, is " + sum + " and the average is " + average);

        userChoice = SafeInput.getRangedInt(in,"Choose a number",1,100);

        for(int l = 0; l < dataPoints.length; l++)
        {
            if (dataPoints[l] == userChoice)
            {
                countValue ++;
            }
        }
        System.out.println("Your value was found " + countValue + " times");

        for (int l = 0; l < dataPoints.length; l++)
        {
            if (dataPoints[l] == userChoice)
            {
                System.out.println("Your value " + userChoice + " was found at " + l);
                withinArray = true;
                break;
            }
        }
        if (!withinArray)
        {
            System.out.println("Your value was not found");
        }

        for (int l = 0; l < dataPoints.length; l++)
        {
            if (min > dataPoints[l])
            {
                min = dataPoints[l];
            }
            if (max < dataPoints[l])
            {
                max = dataPoints[l];
            }
        }
        System.out.println("The min is " + min + " and the max is "+ max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }
    public static double getAverage(int values[])
    {
        double sum=0;
        double average;
        for(int l = 0;l<values.length; l++)
        {
            sum += values[l];

        }
        average = sum / values.length;
        return average;
    }

}
