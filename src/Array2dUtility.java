import java.util.ArrayList;

public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static void printAll(int[][] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }

    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    public static int sum(int[][] list)
    {
        int sum = 0;

        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list[i].length; j++)
            {
                sum = sum + list[i][j];
            }
        }

        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] list)
    {
        double sum = 0;
        double count = 0;

        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list[i].length; j++)
            {
                sum = sum + list[i][j];
                count = count + 1;
            }
        }

        double average = sum / count;

        return average;
    }



    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    public static int minimum(int[][] list)
    {
        int minimum = 100;

        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list[i].length; j++)
            {
                if(list[i][j] < minimum)
                {
                    minimum = list[i][j];
                }
            }
        }

        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    public static int maximum(int[][] list)
    {
        int maximum = 0;

        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list[i].length; j++)
            {
                if(list[i][j] > maximum)
                {
                    maximum = list[i][j];
                }
            }
        }

        return maximum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    public static int evenCountStandard(int[][] list)
    {
        int count = 0;

        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list[i].length; j++)
            {
                if(list[i][j] % 2 == 0)
                {
                    count = count + 1;
                }
            }
        }

        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    public static int evenCountEnhanced(int[][] list)
    {
        return Array2dUtility.evenCountStandard(list);
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    public static boolean allPositive(int[][] list)
    {
        boolean output = true;

        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list[i].length; j++)
            {
                if(list[i][j] < 0)
                {
                    output = false;
                }
            }
        }

        return output;
    }


    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] list)
    {
        int[] output = new int[5];

        for(int i = 0; i < list.length; i++)
        {
            int rowSum = 0;

            for(int j = 0; j < list[i].length; j++)
            {
                rowSum = rowSum + list[i][j];
            }

            output[i] = rowSum;
        }

        return output;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

    public static int[] colSums(int[][] list)
    {
        int[] output = new int[5];

        for(int i = 0; i < list.length; i++)
        {
            int colSum = 0;

            for(int j = 0; j < list[i].length; j++)
            {
                colSum = colSum + list[j][i];
            }

            output[i] = colSum;
        }

        return output;
    }

}
