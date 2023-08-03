/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Huong Le, hpl14@scarletmail.rutgers.edu, hpl14
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    int n = Integer.parseInt(args[0]);
    int x = 0; //starting point for tracking location x
    int y = 0 ;// starting point for tracking location y 
    System.out.println("("+ x + "," + y + ")"); //origin
    
    for (int i = 0; i < n; i++){
        int direction = (int)(1+Math.random()*4); // find the random direction that waker is going to head
        if (direction == 1) {// heading East
            x += 1;
        }
        else if (direction == 2) {//heading West
            x -= 1;
        }
        else if (direction == 3) {//heading North
            y += 1;
        }
        else{// heading South
            y -= 1;
        }
    System.out.println("("+ x + "," + y + ")");
    }
    double square = (Math.pow(x,2)) + (Math.pow(y,2));
    System.out.println( "Squared distance = " + square);
    }
}
