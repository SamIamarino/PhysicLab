/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoteste;

public class Formulas {
    
    public static double MRU_Espaco (double espacoInicial, double velocidade, double tempo){
        double espacoFinal = espacoInicial + (velocidade * tempo);
        return espacoFinal;
    }
    
    public static double MRU_Velocidade (double espacoInicial, double espacoFinal, double tempo){
        double velocidade = (espacoFinal-espacoInicial)/tempo;
        return velocidade;
    }
    
    public static double MRUV_Aceleracao (double velocidadeInicial, double velocidadeFinal, double tempo){
        double aceleracao = (velocidadeFinal-velocidadeInicial)/tempo;
        return aceleracao;

    }
    
    public static double MRUV_Velocidade (double velocidadeInicial, double aceleracao, double tempo){
        double velocidadeFinal = (velocidadeInicial + (aceleracao*tempo));
        return velocidadeFinal;
    }
    
    public static double MRUV_Espaco (double espacoInicial, double velocidadeIncial, double tempo, double aceleracao){
        double espacoFinal = espacoInicial + (velocidadeIncial * tempo) + ((aceleracao * Math.pow(tempo, 2))/2);
        return espacoFinal;
    }
    
    public static double MRUV_Torricelli (double velocidadeIncial, double aceleracao, double deltaS){
        double velocidadeQuadrada = Math.pow(velocidadeIncial,2) + (2*aceleracao*deltaS);
        double velocidadeFinal = Math.sqrt(velocidadeQuadrada);
        return velocidadeFinal;
    }
}
