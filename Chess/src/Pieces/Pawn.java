/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pieces;

import chess.Board;
import chess.Colour;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celeb
 */
public class Pawn extends Piece {

    public Pawn(String displayIcon, int rowPosition, int colPosition, Colour playerColour) {
        super(displayIcon, colPosition, rowPosition, playerColour);
    }
    
    @Override
    public List<int[]> getAndDisplayValidMoves(Board board) { /*...*/ return new ArrayList<>();
//    private String displayIcon;
//    private int rowPosition;
//    private int colPosition;
//    private Colour playerColour;
    }
}
