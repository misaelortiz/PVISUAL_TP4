/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto3.aplicacion.controlador.beans.form;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pto3.aplicacion.modelo.dominio.Calculadora;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class CalculadoraFormBean implements Serializable{
    Calculadora calculadora;
    
    public CalculadoraFormBean() {
        calculadora = new Calculadora();
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
}
