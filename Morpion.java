/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import java.util.ArrayList;




/**
 *
 * @author poensing
 */
public class Morpion {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Case> casesCochées = new ArrayList<>();
        ArrayList<Case> cases = new ArrayList<>();
        
        
        Case c1 = new Case(1,EtatCase.NON_COCHEE);
        cases.add(c1);
        Case c2 = new Case(2,EtatCase.NON_COCHEE);
        cases.add(c2);
        Case c3 = new Case(3,EtatCase.NON_COCHEE);
        cases.add(c3);
        Case c4 = new Case(4,EtatCase.NON_COCHEE);
        cases.add(c4);
        Case c5 = new Case(5,EtatCase.NON_COCHEE);
        cases.add(c5);
        Case c6 = new Case(6,EtatCase.NON_COCHEE);
        cases.add(c6);
        Case c7 = new Case(7,EtatCase.NON_COCHEE);
        cases.add(c7);
        Case c8 = new Case(8,EtatCase.NON_COCHEE);
        cases.add(c8);
        Case c9 = new Case(9,EtatCase.NON_COCHEE);
        cases.add(c9);
        
        
    }
    

    
}
