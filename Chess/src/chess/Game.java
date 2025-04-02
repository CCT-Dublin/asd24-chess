/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

/**
 *
 * @author celeb
 */
public class Game {
    private Player whitePlayer;
    private Player blackPlayer;
    private Colour playerTurn;
    private Board board;
    
    public void startGame() {
        playerTurn = Colour.White;
    }
    
    public void endGame() {
        
    }
    
    public void nextTurn() {
        switch (playerTurn) {
            case White: {
                playerTurn = Colour.Black;
                break;
            }
            case Black: {
                playerTurn = Colour.White;
                break;
            }
        }
    }
}
