/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable1;

/**
 *
 * @author aleix
 */
public class Jugador {
    //====Atributs=====//
    private String nom;
    private Dau dau;
    private Fitxa fitxa;
    
    //====Constructor===// (INCOMPLET)
    public Jugador(String nomArg, String colorArg, Dau dauArg, Tauler taulerArg){
        this.nom = nomArg;
        this.fitxa = new Fitxa(colorArg, this, new Casella(1, "Casella convencional") );
        this.dau = dauArg;
        
    }
    
    //==Metodes===// (INCOMPLET)
    
    
        
}
