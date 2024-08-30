/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulax;

/**
 *
 * @author android
 */
public class Cafe extends Bebida{
    
    @Override
    public void infusao(){
        System.out.println("Colocar a agua fervendo no café");
    }
    
    @Override
    public void adicionarCondimentos(){
        System.out.println("Colocar açucar no café");
    }
    
}
