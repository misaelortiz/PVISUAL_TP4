/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto5.aplicacion.modelo.dominio.Profesor;

/**
 *
 * @author E. Misael Ortiz
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private String materia;
    private long legajo;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the DNI
     */
    public long getLegajo() {
        return  legajo;
    }

    /**
     * @param legajo
     
     */
    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }
    
}
