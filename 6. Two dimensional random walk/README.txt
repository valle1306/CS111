wo-dimensional random walk (20 points). A two-dimensional random walk simulates the behavior of a particle moving in a grid of points. At each step, the random walker moves north, south, east, or west with probability equal to 1/4, independent of previous moves. Write a program RandomWalker.java that takes an int command-line argument n and simulates the motion of a random walk for n steps. Print the location at each step (including the starting point), treating the starting point as the origin (0, 0). Also, print the square of the final squared Euclidean distance from the origin as double.
Note: you do not need arrays for this problem, just keep track of the x and y coordinates during the random walk.


java RandomWalker 20
(0,0)
(0,1)
(-1,1)
(-1,2)
(0,2)
(1,2)
(1,3)
(0,3)
(-1,3)
(-2,3)
(-3,3)
(-3,2)
(-4,2)
(-4,1)
(-3,1)
(-3,0)
(-4,0)
(-4,-1)
(-3,-1)
(-3,-2)
(-3,-3)
Squared distance = 18.0
