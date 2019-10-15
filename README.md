# 8-Puzzle-Problem-Solution-using-A* Search

ITCS 6150 – Intelligent Systems Project Report Title: 8 Puzzle Problem Solution using A* Search
Name: Sourav Roy Choudhury ID- 801100959
Date: 02-11-2019
Purpose:
The objective of the project is to solve the 8-puzzle problem using A star (*) search algorithm. In order to determine the best possible ways, two heuristic techniques are discussed:
a. Misplaced Tiles Concept
b. Manhattan Distance Concept
Project Details: Application Overview: INPUT:
a. The user is asked to enter numbers from 0 to 8. This is the representation of initial state of puzzle.
b. The user is asked to enter numbers from 0 to 8. This is the representation of final (goal) state of puzzle.
c. The application basically implements various combinations to reach or match the goal state. The process is carried out by moving the tiles present in free space i.e 0.
d. In order to find out the best heuristic the user has a choice of two methods; Manhattan Distance or Misplaced Tiles method.
e. The main objective is to expand the state with least heuristic.
f. The above step is repeated till the goal state is reached.
g. For every move we need to calculate f(n) which depends directly on two separate variables g(n) and h(n). A* algorithm runs on the principle that lowest sum of f(n) decides the next possible best move.
h. g(n)- It is basically defined as the distance from the initial state to the current state.
i. h(n)- It is basically defined as the distance from the current state to goal or final state.
j. Once the puzzle has been solved, the application prints a couple of outputs :
Heuristics:
Manhattan Distance: In this heuristic technique each number in present state is compared to goal state. It is an admissible heuristic distance where the return value is the cumulative sum of steps needs by each tile to reach their individual goal state from current state.
Formula:
[(difference of x coordinates from initial to goal node) + (difference of y coordinates from initial to goal node)]
Misplaced tiles: In this heuristic technique each element of present node is compared with goal node, this is done in order to compute the number of steps taken by the misplaced tile to reach the goal node. The number of misplaced tiles gives us the heuristic value.
Language :
The program was developed in Java
Input:
The user can choose from two heuristics methods i.e Manhattan Distance and Misplaced Tiles. Also the user has to provide the initial state and desired final state as per discretion.
Output:
Path Direction:
This is the direction to goal. The traversal here is represented as Left, Right, up and Down.

Final Count:
This is the calculated total path cost from n to goal i.e from initial state to final state. This is displayed as f(n) which is basically the summation of g(n) and h(n). Kindly note that just the final f(n) is displayed in the output.
