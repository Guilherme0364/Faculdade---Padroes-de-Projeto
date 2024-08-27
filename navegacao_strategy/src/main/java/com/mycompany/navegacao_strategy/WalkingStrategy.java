/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navegacao_strategy;

/**
 *
 * @author android
 */
public class WalkingStrategy implements RouteStrategy{

    @Override
    public void buildRoute(String a, String b) {
        System.out.println("´Walking Strategy: " + a + "and" + b);
    }
    
}
