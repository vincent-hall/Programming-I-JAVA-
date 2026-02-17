# Programming-I-JAVA-
All projects i worked on in my Computer Programming I course in java.
I also included the code we wrote for homework and classwork.




------------------------------------------------------------------------------------------
Simple Calculator Final Project 
🚀 Features

    Multi-Number Calculations: Unlike a basic two-number calculator, this tool allows you to specify exactly how many numbers you want to process in a single operation.

    Dynamic Arrays: Utilizes arrays to store and iterate through user inputs for clean data handling.

    Overflow Protection: Employs Math.addExact, Math.subtractExact, and Math.multiplyExact to ensure integer calculations don't exceed the capacity of the data type.

    Input Validation: * Checks for a minimum of two numbers to ensure a valid calculation.

        Includes a safety check for division by zero.

        Validates operator input (+, -, *, /).

    Repeatability: Built with a do-while loop, allowing users to perform multiple calculations without restarting the program.

🛠️ Logic & Implementation

The program follows a clear logical flow to ensure a smooth user experience:

    Scanner Initialization: Captures user input via the console.

    Count Selection: The user defines the size of the operation, which dynamically initializes an array.

    The Switch-Case Engine: A switch statement processes the chosen operator within a loop, updating the total result as it iterates through the array.

    Formatting: The final output prints the entire mathematical expression (e.g., 10.0 + 5.0 + 2.0 = 17.0) for clarity.

💻 Tech Stack

    Language: Java

    IDE: NetBeans / Apache NetBeans

    Key Classes: java.util.Scanner, java.lang.Math
