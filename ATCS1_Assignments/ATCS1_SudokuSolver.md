**Introduction**
Sudoku is a puzzle where you fill in numbers 1-9 on a 9x9 board such that no number is duplicated in any row, column, or 3x3 sub-grid. For more information about the puzzle, see Wikipedia: http://en.wikipedia.org/wiki/Sudoku

**What to Do**
Write a program to solve a Sudoku puzzle.

The input will consist of 81 characters that are numerals (1-9) or dashes (-) in a CSV file. All other characters should be ignored.

The output must consist of 9 lines of 9 characters each. Each character must be a numeral (1-9), and the whole output must be a solution to the input puzzle.

**Sudoku Board**
Devise a SudokuBoard class to support manipulations like: 

void place(r,c,n) // place numeral n at position (r,c) 
String toString() // string representation of the board
int get(r,c) // return the numeral at position (r,c) 
void remove(r,c) // remove the numeral at position (r,c) 
boolean canPlace(r,c,n) // true if the board would allow placing n at (r,c) 
boolean solved() // true if there are no blank spots on the board

...and any others you deem appropriate (a getMostConstrained method could be useful)

Implement and test your board with throw-away programs until you're sure it's correct. At the same time, be thinking about the design and implementation of the main program. 

**Making the Solver**
Create a stack that is a linked list of sudoku boards 
Stack\<SudokuBoard\> stack = new LinkedList\<SudokuBoard\>();

To solve, use an algorithm such as this:
•	Pop a board off the stack  

•	Check to see if the board is solved. If it is, return it.  

•	Determine the most constrained square on the board (the one that will accept the fewest numerals)  

•	For each possible numeral that can go in the most constrained square on the board, create a new board, add the numeral to the board, and push the board onto the stack. (Note- there may be 0 possible options for the most constrained square. In that case, do nothing!)  

•	Repeat.

**Now make it faster**

Using System.currentTimeMillis() (or something comparable) determine how long it takes your program to solve a given board. You should design your project in such a way that a single call to a solve method can be easily timed. Once you have a baseline time, try to make it faster. We will, in class, see whose solver is best once the projection is done.

**Questions to think about**
1. What design decisions did you make in completing the project? 
2. Did you create an object to represent a “solver” or did you perform the solve from a static context?
3. What changes did you make to optimize for time? Which changes had the biggest impact?




