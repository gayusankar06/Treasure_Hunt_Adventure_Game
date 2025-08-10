import java.util.Scanner;
    public class TreasureHuntAdventure {
        public static void main(String[] args) {
            int health = 100;
            int coins = 0;
            boolean gameOver = false;
            Scanner input = new Scanner(System.in);
            System.out.println("======== 🎉 Welcome to the Treasure Hunt 🎉 ========");
            System.out.println("Health: " + health);
            System.out.println("Coins: " + coins);
            while (!gameOver) {
                System.out.println("\nChoose an action:");
                System.out.println("1. Fight a monster (-20 health, +10 coins)");
                System.out.println("2. Search for treasure (-10 health, +20 coins)");
                System.out.println("3. Rest (+15 health, -5 coins)");
                System.out.println("4. Check status");
                System.out.println("5. Quit");
                System.out.print("Enter your choice (1-5): ");
                int choice = input.nextInt();
                if (choice == 1) { // Fight
                    health -= 20;
                    coins += 10;
                    System.out.println("You fought a monster!");
                }
                else if (choice == 2) { // Search
                    health -= 10;
                    coins += 20;
                    System.out.println("You found some treasure!");
                }
                else if (choice == 3) { // Rest
                    health += 15;
                    coins -= 5;
                    System.out.println("You took a rest and recovered.");
                }
                else if (choice == 4) { // Status
                    System.out.println("Health: " + health + " | Coins: " + coins);
                }
                else if (choice == 5) { // Quit
                    System.out.println("Goodbye!");
                    gameOver = true;
                    continue;
                }
                else {
                    System.out.println("Invalid choice! Try again.");
                    gameOver = true;
                    continue;
                }

                // Show updated status after an action
                System.out.println("Health: " + health + " | Coins: " + coins);

                // Win condition
                if (coins >= 100) {
                    System.out.println("🎉 You Won! Congratulations!");
                    gameOver = true;
                }
                // Lose condition
                else if (health <= 0) {
                    System.out.println("💀 You Lost! Better luck next time!");
                    gameOver = true;
                }
            }
            input.close();
        }
    }
