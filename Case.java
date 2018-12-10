/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;


/**
 *
 * @author poensing
 */
public class Case {
    
    private EtatCase etatCase;
    private int numCase;
    
    
    
    Case(int numCase, EtatCase etatCase){
        this.numCase = numCase;
        this. etatCase = etatCase;
    }

        
        
    
    /**
     * @return the etatCase
     */
    public EtatCase getEtatCase() {
        return etatCase;
    }

    /**
     * @param etatCase the etatCase to set
     */
    public void setEtatCase(EtatCase etatCase) {
        this.etatCase = etatCase;
    }

    /**
     * @return the numCase
     */
    public int getNumCase() {
        return numCase;
    }

    /**
     * @param numCase the numCase to set
     */
    public void setNumCase(int numCase) {
        this.numCase = numCase;
    }
    
    
}
