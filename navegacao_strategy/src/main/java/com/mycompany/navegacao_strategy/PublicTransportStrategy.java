/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navegacao_strategy;

/**
 *
 * @author android
 */
public class PublicTransportStrategy implements RouteStrategy{

    @Override
    public void buildRoute(String a, String b) {
        System.out.println("´PUBLIC TRANSPORT Strategy: " + a + "and" + b);
    }
    
}
