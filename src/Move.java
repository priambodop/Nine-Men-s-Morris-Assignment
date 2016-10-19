/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priambodo_pangestu
 */
public class Move {
    
    public static final int PLACE_PION = 1;
    public static final int MOVE_PION = 2;
    public static final int REMOVE_PION = 3;
    
    public int fromPosition,toPosition,positionOfTakenPion,typeOfMove;

    public Move(int toPosition) {
//        if (toPosition < 0 || toPosition >= BoardState.NUMBER_OF_POSITIONS) {
//            throw new IllegalArgumentException();
//        }

        this.fromPosition = -1;
        this.toPosition = toPosition;
        this.positionOfTakenPion = -1;
    }

    public Move(int fromPosition, int toPosition) {
//        if (toPosition < 0 || toPosition >= BoardState.NUMBER_OF_POSITIONS
//                || fromPosition < -1 || fromPosition >= BoardState.NUMBER_OF_POSITIONS) {
//            throw new IllegalArgumentException();
//        }

        this.fromPosition = fromPosition;
        this.toPosition = toPosition;
        this.positionOfTakenPion = -1;
    }

    public Move(int fromPosition, int toPosition, int positionOfTakenPiece) {
//        if (toPosition < 0 || toPosition >= BoardState.NUMBER_OF_POSITIONS
//                || fromPosition < -1 || fromPosition >= BoardState.NUMBER_OF_POSITIONS
//                || positionOfTakenPion < 0 || positionOfTakenPion >= BoardState.NUMBER_OF_POSITIONS) {
//            throw new IllegalArgumentException();
//        }

        this.fromPosition = fromPosition;
        this.toPosition = toPosition;
        this.positionOfTakenPion = positionOfTakenPiece;
    }
}
