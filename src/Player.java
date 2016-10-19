/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priambodo_pangestu
 */
public abstract class Player {
    protected String name;
    protected int numOfPionOnHand;
    protected int numOfPionOnBoard;
    protected int numOfWinGames;
    protected Pion myPion;
    
    protected Player(){
        this.numOfPionOnBoard = 0;
        this.numOfWinGames = 0;
        
    }
    
    protected Player(String name,Pion newPion,int numOfPionOnHand){
        this();
        this.name = name;
        this.myPion = newPion;
        this.numOfPionOnHand = numOfPionOnHand;
    }
    
    public void resetGame(){
        this.numOfPionOnBoard = 0;
        this.numOfWinGames = 0;
    }
    
    public int getNumOfPionOnHand(){
        return this.numOfPionOnHand;
    }
    
    public int getNumOfPionOnBoard(){
        return this.numOfPionOnBoard;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Pion getPlayerPion(){
        return myPion;
    }
    
    public abstract boolean isSmartPlayer();
}
