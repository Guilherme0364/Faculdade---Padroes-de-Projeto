/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulax;

/**
 *
 * @author android
 */
public class AulaX {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Bebida cafe = new Cafe();
        Bebida cha = new Cha();
        
        System.out.println("Fazer café");
        cafe.prepare();
        
        System.out.println("Fazer o chá");
        cha.prepare();
        
    }
}
