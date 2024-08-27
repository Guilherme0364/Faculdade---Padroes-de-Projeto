/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.navegacao_strategy;

/**
 *
 * @author android
 */
public class Client {

    public static void main(String[] args) {
        String a = "Local A";
        String b = "Local B";
        
        Navigator navigator = new Navigator();
        navigator.setStrategy(new RoadStrategy());
        navigator.buildRoute(a, b);
        
        navigator.setStrategy(new WalkingStrategy());
        navigator.buildRoute(a, b);
    }
}
