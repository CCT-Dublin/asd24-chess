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
    
    public void movePiece(Piece movingPiece) {
        
    }
    
    public Piece checkForCapture(Piece movingPiece) {
        
    }
    
    public void getAndDisplayValidMoves(Piece piece) {
    }
    
    public boolean isCheckMate() {
        
    }
    
    public void displayBoard(Player player) {
        for(Piece i:grid){
            grid[i.getRowPosition][i.getColPosition]
                    
                    
        }
        System.out.println(grid.toString());
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
