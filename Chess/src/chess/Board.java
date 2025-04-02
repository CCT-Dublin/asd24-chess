/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import Pieces.Piece;
import java.util.List;

/**
 *
 * @author celeb
 */
public class Board {

    private List<Piece> whitePieces;
    private List<Piece> blackPieces;
    private Piece[][] grid = new Piece[8][8];
    public String[][] displayGrid = new String[8][8];

    public void fillEmptyGrid() {
        for (int i = 0; i < displayGrid.length; i++) {
            for (int j = 0; j < displayGrid[i].length; j++) {
                displayGrid[i][j] = " ";
            }
        }
    }

    public void updateBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                displayGrid[i][j] = grid[i][j].getDisplaySymbol();

            }

        }

    }

    public void movePiece(Piece movingPiece) {

    }

    public Piece checkForCapture(Piece movingPiece) {

    }

    public void getAndDisplayValidMoves(Piece piece) {
    }

    public boolean isCheckMate() {

    }

    public void displayBoard(String[][] displayGrid) {
        System.out.println(displayGrid);

    }
}

   
    }

    public void listPlayerPieces(Player player) {
        System.out.println(getWhitePieces());
        System.out.println(getBlackPieces());
    }

    public List<Piece> getWhitePieces() {
        return whitePieces;
    }

    public List<Piece> getBlackPieces() {
        return blackPieces;//Davidkirbymusician@gmail.com
    }
}
