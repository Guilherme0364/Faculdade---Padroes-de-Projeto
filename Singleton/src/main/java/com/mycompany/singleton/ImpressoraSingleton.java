/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author android
 */
public class ImpressoraSingleton {
    
    private static ImpressoraSingleton instance;
    private final String fabricante;
    
    private ImpressoraSingleton(String fabricante){
        this.fabricante = fabricante;
    }
    
    public static ImpressoraSingleton getInstance(String fabricante){
        if (instance == null){
            instance = new ImpressoraSingleton(fabricante);
        }
        return instance;            
    }
    
    public void exibirImpressora(){
        System.out.println("Impressora " + this.fabricante);
    }
}
