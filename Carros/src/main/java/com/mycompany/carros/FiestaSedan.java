/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carros;

/**
 *
 * @author android
 */
public class FiestaSedan implements CarroSedan{

    String modelo;
    String fábrica;
    String categoria;

    @Override
    public void exibirInfoSedan() {
        modelo = "Fiesta Sedan";
        fábrica = "Ford";
        categoria = "Sedan";

        System.out.println("Carro: " + modelo + " - " + fábrica + " - " + categoria);
    }
}
