/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Huong Le
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int t = 0;
        if (a<b){ // a is bigger than b
            t=a; a=b; b=t;
        }
        if (a<c){// a is bigger than b and c
            t=c; a=c; c=a;
        }
        if (a<d){//a is bigger than b,c, and d
            t=d; a=d; d=a;
        }
        if (a<e){//a is bigger than all
            t=e;a=e;e=a;
        }
        System.out.println(a);
    }
}