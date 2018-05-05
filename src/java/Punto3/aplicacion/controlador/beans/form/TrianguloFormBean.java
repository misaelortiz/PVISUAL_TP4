/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.aplicacion.controlador.beans.form;

import Punto3.aplicacion.modelo.dominio.Triangulo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class TrianguloFormBean {
    private Triangulo triangulo;
    
    public TrianguloFormBean() {
        triangulo = new Triangulo();
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }
    
}
