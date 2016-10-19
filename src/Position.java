/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priambodo_pangestu
 */
public class Position {

    private int indexPosition;
    private boolean isOccupied;
    private Pion playerOccupyIt;
    private int[] indexOfAdjacentPos;

    public Position(int position) {
        this.isOccupied = false;
        this.indexPosition = position;

    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    public int getIndexPosition() {
        return this.indexPosition;
    }

    public Pion getPlayerOccupyIt() {
        return this.getPlayerOccupyIt();
    }

    public void setOccupyPos(Pion playerPion) {
        this.isOccupied = true;
        this.playerOccupyIt = playerPion;
    }

    public void addAdjacentPositionsIndexes(int pos1, int pos2) {
        this.indexOfAdjacentPos = new int[2];
        this.indexOfAdjacentPos[0] = pos1;
        this.indexOfAdjacentPos[1] = pos2;
    }

    public void addAdjacentPositionsIndexes(int pos1, int pos2, int pos3) {
        this.indexOfAdjacentPos = new int[3];
        this.indexOfAdjacentPos[0] = pos1;
        this.indexOfAdjacentPos[1] = pos2;
        this.indexOfAdjacentPos[2] = pos3;
    }

    public void addAdjacentPositionsIndexes(int pos1, int pos2, int pos3, int pos4) {
        this.indexOfAdjacentPos = new int[4];
        this.indexOfAdjacentPos[0] = pos1;
        this.indexOfAdjacentPos[1] = pos2;
        this.indexOfAdjacentPos[2] = pos3;
        this.indexOfAdjacentPos[3] = pos4;
    }
    
    public boolean isAdjacentToThis(int position){
        for(int i = 0; i < this.indexOfAdjacentPos.length;i++){
            if(this.indexOfAdjacentPos[i] == position){
                return true;
            }
            else{
                break;
            }
        }
        return false;
    }
    
    public int[] getIndexOfAdjacentPos(){
        return this.indexOfAdjacentPos;
    }
    
    
}
