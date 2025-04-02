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
    
    public void Game (Player whitePlayer, Player blackPlayer) {
        this.playerTurn = Colour.White;
        this.whitePlayer.setName(whitePlayer.getName());
        this.blackPlayer.setName(blackPlayer.getName());
    };
    
    public void startGame() {
        // Initializing board
        Board.initializeBoard();
        Board.displayBoard(whitePlayer);
        
        nextTurn();

    }
    
    public void endGame() {
        if (!Board.isCheckmate()) { // check for checkmate
            if (whitePlayer.pieces.isEmpty() || blackPlayer.pieces.isEmpty()) { 
                // check for remaining pieces for black or white player
                // game ends
            } else {
                // game continues
            }
        } else {
            // game ends
        }
    }
    
    public void nextTurn() {
        switch (playerTurn) {
            case White: {
                playerTurn = Colour.Black;
                Board.displayBoard(blackPlayer);
            }
            
            case Black: {
                playerTurn = Colour.White;
                Board.displayBoard(whitePlayer);
            }
        }
    }
}
