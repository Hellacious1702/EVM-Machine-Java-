import java.util.Scanner;

public class EVMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;
        int nota = 0;

        boolean state = true;

        while (state) {
            System.out.println("\n--- Cast Your Vote ---");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");
            System.out.println("4. NOTA");
            System.out.println("5. Exit and Show Results");

            System.out.print("\n Your Vote : ");
            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    candidate1++;
                    System.out.println("\n Vote Counted for Candidate A");
                    break;
                case 2:
                    candidate2++;
                    System.out.println("\n Vote Counted for Candidate B");
                    break;
                case 3:
                    candidate3++;
                    System.out.println("\n Vote Counted for Candidate C");
                    break;
                case 4:
                    nota++;
                    System.out.println("\n Vote Counted for NOTA");
                    break;
                case 5:
                    System.out.println("Total Votes of Candidate A: " + candidate1);
                    System.out.println("Total Votes of Candidate B: " + candidate2);
                    System.out.println("Total Votes of Candidate C: " + candidate3);
                    System.out.println("Total Votes of NOTA: " + nota);

                    determineWinner(candidate1, candidate2, candidate3,nota);
                    state = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        sc.close();
    }

    public static void determineWinner(int candidate1Votes, int candidate2Votes, int candidate3Votes , int NOTAvotes) {
        int maxVotes = Math.max(candidate1Votes, Math.max(candidate2Votes, candidate3Votes));

        if (maxVotes == candidate1Votes && maxVotes == candidate2Votes && maxVotes == candidate3Votes) {
            System.out.println("\nElection resulted in a three way tie.");
        } else if (maxVotes == candidate1Votes && maxVotes == candidate2Votes) {
            System.out.println("\nElection resulted in a tie between Candidate A and Candidate B.");
        } else if(maxVotes == candidate1Votes && maxVotes == candidate3Votes){
            System.out.println("\nElection resulted in a tie between Candidate A and Candidate C.");
        } else if (maxVotes == candidate2Votes && maxVotes == candidate3Votes){
            System.out.println("\nElection resulted in a tie between Candidate B and Candidate C.");
        } else if (maxVotes == candidate1Votes) {
            System.out.println("\nWinner: Candidate A");
        } else if (maxVotes == candidate2Votes) {
            System.out.println("\nWinner: Candidate B");
        } else if(NOTAvotes >= maxVotes){
            System.out.println("\nMaximum votes of NOTA");
        } else {
            System.out.println("\nWinner: Candidate C");
        }
    }
}