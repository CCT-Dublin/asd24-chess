/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import java.util.Scanner;

/**
 *
 * @author celeb
 */
public class Menu {
    public static void mainMenu() {
        
        Scanner sc = new Scanner(System.in);
        boolean validOption = false;
        while (!validOption) {
            displayMainMenuOptions();
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1: {
                        Game game = new Game();
                        game.startGame();
                        break;
                    }
                    case 0: {
                        System.out.println("Thank you for playing!");
                        System.exit(0);
                    }
                }
            } catch (Exception e) {
                
            }
        }
    }
    
    private static void displayMainMenuOptions() {
        System.out.println("Please enter the number of your desired choice:");
        System.out.println("1: Start Game");
        System.out.println("0: Exit");
    }
}
