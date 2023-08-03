Wind chill [15 points]. Given the temperature T (in degrees Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) as follows:
w = 35.74 + 0.6215 T + (0.4275 T – 35.75) v^0.16
Write a program WindChill.java that takes two double command-line arguments temperature and velocity and prints the wind chill. 
NOTE 1: a^b means a to the power of b. Use Math.pow(a,b) to compute a^b.
NOTE 2: The formula is not valid if T is larger than 50 in absolute value or if v is larger than 120 or less than 3. Assume that the input values testing your program are in range.
NOTE 3: It is not necessary to round the wind chill value, display the value that is computed.
NOTE 4: Do not use loops for this program.
% java WindChill 35.0 10.0
27.445420
