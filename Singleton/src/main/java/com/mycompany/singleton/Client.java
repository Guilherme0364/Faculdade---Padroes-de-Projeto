/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton;

/**
 *
 * @author android
 */
public class Client{

    public static void main(String[] args) {
        
        ImpressoraSingleton impressora = ImpressoraSingleton.getInstance("HP");
        impressora.exibirImpressora();
                
    }
}
