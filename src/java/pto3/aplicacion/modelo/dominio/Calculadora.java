/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto3.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Calculadora implements Serializable{
    
    private double resultado;

    

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double suma (double numIngresado1, double numIngresado2){
        resultado=numIngresado1+numIngresado2;
        return resultado;
    }
    public double restar(double numIngresado1, double numIngresado2){
        resultado=numIngresado1-numIngresado2;
        return resultado;
    }
    public double multiplicar(double numIngresado1, double numIngresado2){
        resultado=numIngresado1*numIngresado2;
        return resultado;
    }
    public double dividir(double numIngresado1, double numIngresado2){
        resultado=numIngresado1/numIngresado2;
        return resultado;
    }
    public double potenciar(double numIngresado1, double numIngresado2){
        resultado=Math.pow(numIngresado1, numIngresado2);
        return resultado;
    }
    
}
