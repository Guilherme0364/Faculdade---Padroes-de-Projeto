/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulax;

/**
 *
 * @author android
 */
public abstract class Bebida {
    public void prepare(){
        ferveragua();
        infusao();
        despejarNaXicara();
        adicionarCondimentos();    
    }

    public void ferveragua() {
        System.out.println("Ferver um pouco de água");
    }

    public abstract void infusao();    
    
    public void despejarNaXicara(){
        System.out.println("");
    }
    
    public abstract void adicionarCondimentos();
}
