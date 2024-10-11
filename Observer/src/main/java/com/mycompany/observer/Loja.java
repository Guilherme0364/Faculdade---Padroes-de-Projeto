/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

import java.util.ArrayList;

/**
 *
 * @author android
 */
public class Loja implements Subject{
    
    private ArrayList<Observer> observers;
    private String nome;
    
    public Loja(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        
        if(index > 0)
            observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Item: " + nome + " agora está disponível na Loja");
        
        for(Observer o : observers)
            o.update(nome);
    }
    
    public void setNovoProduto(String nome){
        this.nome = nome;
        
        notifyObserver();
    }
    
}
