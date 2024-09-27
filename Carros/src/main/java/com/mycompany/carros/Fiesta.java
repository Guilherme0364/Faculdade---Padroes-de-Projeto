/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carros;

/**
 *
 * @author android
 */
public class Fiesta implements CarroPopular{

    String modelo;
    String fábrica;
    String categoria;

    @Override
    public void exibirInfoPopular() {
        modelo = "Fiesta";
        fábrica = "Ford";
        categoria = "Popular";

        System.out.println("Carro: " + modelo + " - " + fábrica + " - " + categoria);
    }
}