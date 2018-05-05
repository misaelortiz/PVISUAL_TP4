/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Triangulo implements Serializable{
    private double lado1;
    private double lado2;
    private double lado3;
    private String mensaje;
    private double perimetro;

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public void visualizarMensaje(){
        mensaje="No se ha formado la figura";
        if (lado1 != 0 && lado2 !=0 && lado3 != 0){
            calcularPerimetro();
        }
        
    }    
    public void calcularPerimetro(){
        perimetro= lado1+lado2+lado3;
    }
}
