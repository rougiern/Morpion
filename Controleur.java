/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author rougiern
 */
public class Controleur implements Observer{
    
    private VueTournoi tournoi;
    
    public Controleur(){
       
        VueTournoi tournoi = new VueTournoi();
        tournoi.afficher();
    }
    
    

    @Override
    public void update(Observable arg0, Object arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
