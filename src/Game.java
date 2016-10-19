/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priambodo_pangestu
 */
public class Game {
    public static final int NUM_PION_PER_PLAYER = 9;
    public static final int PLACING_PHASE = 1;
    public static final int MOVING_PHASE = 2;
    public static final int THINKING_PHASE = 3;
    
    public static final int MIN_PION_ON_BOARD = 2;
    
    public static final int VALID_MOVE = 0;
    public static final int INVALID_POS = -1;
    public static final int NON_VAILABLE_POS = -2;
    public static final int INVALID_MOVE = -3;
    
    protected Board gameBoard;
    protected int gamePhase;
    
    public Game(){
        gameBoard = new Board();
        gamePhase = Game.PLACING_PHASE;
    }
    
    public int getCurrentPhase(){
        return this.gamePhase;
    }
    
    public Board getBoard(){
        return this.gameBoard;
    }
    
    public Pion getPionPosition(int boardPosition){
        return this.gameBoard.getPosition(boardPosition).getPlayerOccupyIt();
    }
    
}
