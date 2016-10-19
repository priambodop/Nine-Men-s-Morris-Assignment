
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priambodo_pangestu
 */
public class MinimaxSmartPlayer extends SmartPlayer{

    private int depth;
    private Pion otherPion;
    private Move currentBestMove;
    public int topScore = 0;
    public final int maxScore = 1000000;
    
    public MinimaxSmartPlayer(Pion compPion, int numPionOnHand, int depth){
        super(compPion,numPionOnHand);
        this.depth = depth;
        if(compPion == Pion.PION_1){
            this.otherPion = Pion.PION_2;
        }
        else{
            this.otherPion = Pion.PION_1;
        }
        
    }
    
    private Pion getOpponentPion(Pion player){
        if(player == myPion){
            return otherPion;
        }
        else{
            return myPion;
        }
    }
    
    private List<Move> generateMoves(Board gameBoard,Pion player,int gamePhase){
        List<Move> listOfMoves = new ArrayList<Move>();
        Position position,adjacentPosition;
        
        return listOfMoves;
    }
    
    @Override
    public int getPositionToPlacePion(Board gameBoard) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPositionToDeleteOtherPion(Board gameBoard) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Move getPieceToMove(Board gameBoard, int gamePhase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
