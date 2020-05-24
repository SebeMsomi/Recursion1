package org.example.execesi;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( fact(5) );
//        double[] resultArray= {69.4,75.3,43.22,55.21,35.87,87.02};
//        System.out.println("Array Before Sorting- " + Arrays.toString(resultArray));
//        below line will sort the array in ascending order
//        Arrays.sort(resultArray);
//        System.out.println("Array After Sorting- " + Arrays.toString(resultArray));
         int [] arrayResutl = {1789,2035,1899,1456,2013};
         System.out.println("array before sorting" + Arrays.toString(arrayResutl));
         Arrays.sort(arrayResutl);
         System.out.println("array after sorting" + Arrays.toString(arrayResutl));
    }

//    public static long fact(long n)
//    {
//        if(n<=1)
//            return 1;//base case not avoid looping
//            else
//                return n * fact(n-1);
//    }
}
