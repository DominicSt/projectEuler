/*
DominicSt - projectEuler1 6/2/2018


Project Euler problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

 */


public class projectEuler1 {
    public static void main(String[] args){

        int sum = 0;

        if(int i = 0; i<1000; i++){
            if((i % 3 == 0) || (i % 5 == 0)){

                
                //If i has no remainder from [being divided by] 3 or 5 then it is a multiple and should be added to the sum
                 

                System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println("\nSum: " + sum);
    }
}
