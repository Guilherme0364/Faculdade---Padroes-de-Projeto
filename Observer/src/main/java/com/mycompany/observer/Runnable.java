/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observer;

/**
 *
 * @author android
 */
public class Runnable{

    public static void main(String[] args) {
        
        Loja loja = new Loja();
        
        Cliente c1 = new Cliente("guilhermediasgregorio4@gmail.com");
        Cliente c2 = new Cliente("guilhermedg4@gmail.com");
        
        loja.addObserver(c2);
        loja.addObserver(c1);
        
        loja.removeObserver(c2);
        
        loja.setNovoProduto("MacBook");
        
    }
}
