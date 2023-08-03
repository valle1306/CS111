/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Huong Le
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        long number = Long.parseLong(args[0]);
        int sumEven = 0; //initialization of the sums
        int sumOdd = 0;
        int count = 1; //keep track of the position of the digit; initialization from the rightmost digit
        
        while (number > 0){
            if (count % 2 == 0) {// if position of digit is even, then add that digit to the sum of Even digits
                sumEven += number %10;
            }
            else{// if position of digit is Odd, then add odd digits to sum of Odd digits
                sumOdd += number %10;
            }
            number /= 10; // removes the rightmost digit after each iteration
            count ++;
        }
        int finalAnswer = (sumOdd % 10 + (sumEven * 3) % 10) % 10;
        System.out.println(finalAnswer);
    }
}