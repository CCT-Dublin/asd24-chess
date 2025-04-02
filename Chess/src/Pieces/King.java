/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pieces;

import chess.Board;
import chess.Colour;
import java.util.ArrayList;
import java.util.List;


public class King extends Piece {

    public King(String displayIcon, int rowPosition, int colPosition, Colour playerColour) {
        super(displayIcon, colPosition, rowPosition, playerColour);
    }
    
    @Override
    public List<int[]> getAndDisplayValidMoves(Board board) {
        List <int[]> validMoves = new ArrayList<>();
            
//      // possible King moves arraylist
        int[][] possibleMoves = {
            // colPosition+1 and rowPosition (right)
            {colPosition+1, rowPosition},
            // colPosition-1 and rowPosition (left)
            {colPosition-1, rowPosition},
            // colPosition and rowPosition+1 (down)
            {colPosition, rowPosition+1},
            // colPosition and rowPosition-1 (up)
            {colPosition, rowPosition-1},
            // colPosition+1 and rowPosition+1 (dig down right)
            {colPosition+1, rowPosition+1},
            // colPosition-1 and rowPosition+1 (dig down left)
            {colPosition-1, rowPosition+1},
            // colPosition+1 and rowPosition-1 (dig up righ)
            {colPosition+1, rowPosition-1},
            // colPosition-1 and rowPosition-1 (dig up left)
            {colPosition-1, rowPosition-1}
        };
        for(int[] move : possibleMoves){
            int newCol = move[0];
            int newRow = move[1];
            if (newCol < 0 ||  newCol > 7 || newRow < 0 || newRow > 7){
                continue;
            }else {
                validMoves.add(move);
            }
        }
        return new ArrayList<>();
    }
}
