/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pieces;

import chess.Board;
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
    
public Piece(String displayIcon, int rowPosition, int colPosition, Colour playerColour){
    this.displayIcon = displayIcon;
    this.colPosition = colPosition;
    this.rowPosition = rowPosition;
    this.playerColour = playerColour;
}

    public String getDisplayIcon(){
        return displayIcon;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColPosition() {
        return colPosition;
    }

    public Colour getPlayerColour() {
        return playerColour;
    }

    public void setDisplayIcon(String displayIcon) {
        this.displayIcon = displayIcon;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public void setColPosition(int colPosition) {
        this.colPosition = colPosition;
    }

    public void setPlayerColour(Colour playerColour) {
        this.playerColour = playerColour;
    }

    
    public abstract List<int[]> getAndDisplayValidMoves(Board board);
       
    
}
