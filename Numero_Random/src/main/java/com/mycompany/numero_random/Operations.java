/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numero_random;

import javax.swing.JOptionPane;

/**
 *
 * @author Mewtwo
 */
public class Operations {
    
        double numero_random = Math.random()*10;
        int aleatorio = (int)Math.round(numero_random);
        int numeroUsuario;
        
        
    public double getNumero_random() {
        return numero_random;
    }

    public void setNumero_random(double numero_random) {
        this.numero_random = numero_random;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }
        
    
    public int operaciones(){
        
         if(numeroUsuario != aleatorio){
            
            JOptionPane.showMessageDialog(null, "No adivino el numero.");
            
         }
         
         return  numeroUsuario;   
             
    }

    public int getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(int aleatorio) {
        this.aleatorio = aleatorio;
    }
    
    
}



