/*
DominicSt - projectEuler1 3/5/2018
Project Euler problem 2

 */

public class projectEuler2 {

    public static void main(String[] args) {

            long sum = 0;
            long x;  // Previous previous number
            long y = 1;  // Previous number number
            long z = 2; // Current number

            while (z <= 4000000) {

                if (z % 2 == 0){ // If x can be divided by 2 without a remainder it is even, therefore add to the sum
                    sum += z;
                }

                // Update variables 
                x = y;
                y = z;
                z = x + y;
            }

            System.out.println(sum);
        }

}
