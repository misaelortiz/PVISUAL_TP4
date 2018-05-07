/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto3.aplicacion.controlador.beans.form;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import pto3.aplicacion.modelo.dominio.Calculadora;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class CalculadoraFormBean implements Serializable{
    private Calculadora calculadora;
    private String mantisa;

    public String getMantisa() {
        return mantisa;
    }

    public void setMantisa(String mantisa) {
        this.mantisa = mantisa;
    }
    
    public CalculadoraFormBean() {
        calculadora = new Calculadora();
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    public void registrarValorBoton(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String valorSeleccionado = facesContext.getExternalContext().
                                   getRequestParameterMap().get("valorPresionado");
        mantisa = mantisa + valorSeleccionado;
    }
    public void realizarOperacion(){
        double primerNumero = 0;
        double segundoNumero = 0;
        char operadorSeleccionado = ' ';
        for(int i=0;i<mantisa.length();i++){
            char caracterExtraido = mantisa.charAt(i);
            if(caracterExtraido == '+' ||
               (caracterExtraido == '-' && i!= 0) ||
               caracterExtraido == '*' ||
               caracterExtraido == '/' ||
               caracterExtraido == '^'){
                primerNumero = Double.parseDouble(mantisa.substring(0, i));
                segundoNumero = Double.parseDouble(mantisa.substring(i+mantisa.length()));
                operadorSeleccionado = caracterExtraido;
            }
        }
        
        double result=0;
        switch(operadorSeleccionado){
            case '+':{
                result=calculadora.suma(primerNumero, segundoNumero);
                break;
            }
            case '-' :{ 
                result=calculadora.restar(primerNumero, segundoNumero);
                break;
            } 
            case '*' :{
                result=calculadora.multiplicar(primerNumero, segundoNumero);
            }
            case '/': {
                result=calculadora.dividir(primerNumero, segundoNumero);
            }
            case '^': {
                result=calculadora.potenciar(primerNumero, segundoNumero);
            }
           }
       
        mantisa = mantisa + "=" + result;
    }
    public void borrar (){
        mantisa = " ";
    }
}
