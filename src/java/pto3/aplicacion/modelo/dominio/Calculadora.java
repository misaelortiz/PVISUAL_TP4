/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto3.aplicacion.modelo.dominio;

/**
 *
 * @author Alumno
 */
public class Calculadora {
    private double numIngresado1;
    private double numIngresado2;
    private double resultado;

    public double getNumIngresado1() {
        return numIngresado1;
    }

    public void setNumIngresado1(double numIngresado1) {
        this.numIngresado1 = numIngresado1;
    }

    public double getNumIngresado2() {
        return numIngresado2;
    }

    public void setNumIngresado2(double numIngresado2) {
        this.numIngresado2 = numIngresado2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void suma (){
        resultado=numIngresado1+numIngresado2;
    }
    public void restar(){
        resultado=numIngresado1-numIngresado2;
    }
    public void multiplicar(){
        resultado=numIngresado1*numIngresado2;
    }
    public void dividir(){
        resultado=numIngresado1/numIngresado2;
    }
    public void potenciar(){
        resultado=Math.pow(numIngresado1, numIngresado2);
    }
}
