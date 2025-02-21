# EVM Simulator (Java)

This Java program simulates a simplified Electronic Voting Machine (EVM) for educational purposes. It allows users to cast votes for three candidates (Candidate A, Candidate B, Candidate C) and a "None of the Above" (NOTA) option. After voting, the program displays the vote count for each option and declares the winner of the election (or indicates a tie).

## Features

* **Simple Voting Simulation:** Provides a basic command-line interface to simulate voting.
* **Three Candidates + NOTA:** Supports voting for three candidates and the NOTA option.
* **Vote Counting:** Accurately tallies votes for each candidate and NOTA.
* **Winner Determination:** Identifies the candidate with the maximum votes and declares them the winner. Handles tie scenarios.
* **Clear Output:** Displays the vote counts and the election results in a user-friendly format.

## How to Use

1.  **Clone the Repository:**
    ```bash
    git clone [repository URL]
    ```
2.  **Compile the Code:**
    ```bash
    javac EVMMachine.java
    ```
3.  **Run the Program:**
    ```bash
    java EVMMachine
    ```
4.  **Cast Votes:** Follow the on-screen prompts to cast votes for your chosen candidate or NOTA.
5.  **View Results:** Select option 5 to exit and display the election results.

## Code Structure

* **`EVMMachine.java`:** Contains the main program logic, including vote counting, winner determination, and user interaction.

## Contributing

Contributions to this project are welcome. Feel free to submit pull requests or open issues to report bugs or suggest improvements.

## License

This project is licensed under the [Specify License, e.g., MIT License] - see the [LICENSE.md](LICENSE.md) file for details.