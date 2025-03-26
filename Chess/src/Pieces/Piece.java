/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pieces;

import chess.Colour;
import java.util.List;

/**
 *
 * @author celeb
 */
public abstract class Piece {
    private String displayIcon;
    private int rowPosition;
    private int colPosition;
    private Colour playerColour;
    
    public List<int[]> getValidMoves() {
        
    }
}
