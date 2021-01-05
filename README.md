# Unit 7 Programming Project

In this project, you are going to work with arrays and `ArrayLists`. You are also going to work on class creation and interaction.

You should have no code in the `Main` class toward solutions to this project.

You may use the `Main` class for testing purposes, but all of your code for the project should be in the classes described below.

You may create as many helper classes and methods as you deem necessary, but you must include the methods described below, and make use of the `Deck` and `Card` classes provided (unaltered) in order to recieve full credit.

## Part A - `Sorts.java`

In class, we discussed the algorithms behind two different types of sorts: **selection sort** and **insertion sort**. Create a static class `Sorts` that has the following static methods:

    int[] selectionSort(int[] x): Returns the array x sorted in ascending order using a selection sort
    int[] insertionSort(int[] x): Returns the array x sorted in ascending order using an insertion sort
    ArrayList<Integer> selectionSort(ArrayList<Integer> x): Returns the ArrayList x sorted in descending order using a selection sort
    ArrayList<Integer> insertionSort(ArrayList<Integer> x): Returns the ArrayList x sorted in descending order using an insertion sort

Because all the methods in this class are static, remember to not have any instance variables or constructors. Do not modify the parameters in any way.

## Part B - `War.java`

Create a class called `War` that plays the game `War`. The rules of `War` are as follows:

- There are two `Player`s in the game.
- Each `Player`'s name is requested and stored.
- A `Deck` of `Card`s is evenly dealt to all `Player`s.
- Until one `Player` has all the `Card`s
    1. Each `Player` flips over the "top" card in it's hand.
    2. The `Player` with the highest `Card` gets all of the `Card`s added to it's hand. The loser has it's `Card`s removed from it's hands.
    3. If both `Player`s have the same value `Card`, they commit to **War**
    4. In **War**, each `Player` deals three `Card`s face-down, then one `Card` face-up.
    The `Player` with the highest `Card` gets all of the `Card`s from Steps 2 - 4 added to it's hand.
    In the case of a tie, divide the entire pot among the winners.
    5. Ask each `Player` if it wants to keep playing. If yes, it keeps the `Card`s in his/her hand. Otherwise, the other `Player` wins and the game is over
- Display the name of the Winner.

You must use at least two `ArrayList`s in your program.

The following lines of code ran from another class (like `Main.java`) must start a game of `War`.

    War game = new War();
    game.play();

## GRADING BREAKDOWN

- Properly JavaDoc'ed all code wrote: 20 points
- Attempted PART A: 20 points
- PART A works as expected: 20 points
- Attempted PART B: 20 points
- Passed all Test Cases: 5 points/each

On Google Classroom, submit either a link to a repl.it project, or a .zip file containing your project.

## **BONUS - Expanded War**

If you finish early, show your real mastery of the material by implementing a version of War that can work for n-Players.
