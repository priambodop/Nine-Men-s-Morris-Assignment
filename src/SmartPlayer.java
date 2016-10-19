/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priambodo_pangestu
 */
public abstract class SmartPlayer extends Player{
    
    public SmartPlayer(Pion compPion,int numPionOnHand){
        super("smartComp",compPion, numPionOnHand);
    }

    @Override
    public boolean isSmartPlayer() {
        return true;
    }
    
    public abstract int getPositionToPlacePion(Board gameBoard);
    
    public abstract int getPositionToDeleteOtherPion(Board gameBoard);
    
    public abstract Move getPieceToMove(Board gameBoard,int gamePhase);
    
    
}
