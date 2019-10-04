/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentacobro.controlador;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


    

/**
 * Controlador de la Vista cuenta
 * @author Corin Viracacha
 */
@Named(value = "cuenta")
@RequestScoped

public class Cuenta implements Serializable {
    /**
     * nombre, de la persona 
     * apellido, de la persona
     * genero, de la persona
     * idiomas, que habla la persona
     * ubicacion, lugar donde reside la persona
     * diasTrab, dias que trabaja la persona
     */
    private String nombre;
    private String apellido;
    private String profesion;
    private String genero;
    private String[] idiomas;
    private String ubicacion;
    private int diasTrab;


    /**
     * Ir a la pagina de documentos
     * @return nombre de la pagina
     */
    public String irDocumento(){
        return "documentos";
    }
    /**
     * Metodo para obtener el nombre de la persona
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para asignar el nombre de la persona
     * @param nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para obtener el apellido
     * @return apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Metodo para asignar el apellido
     * @param apellido de la persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Metodo para obtener la profesion
     * @return profesion de la persona
     */
    public String getProfesion() {
        return profesion;
    }
    /**
     * Metodo para asignar la profesion
     * @param profesion de la persona
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    /**
     * Metodo para obtener el genero de la persona
     * @return genero
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Metodo para asignar el genero 
     * @param genero de la persona
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }   
    /**
     * Metodo para obtener los idiomas que habla la persona
     * @return 
     */
    public String[] getIdiomas() {
        return idiomas;
    }
    /**
     * Metodo para asignar los idiomas de la persona
     * @param idiomas 
     */
    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }
    /**
     * Metodo para obtener la ubicacion de la persona
     * @return ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }
    /**
     * Metodo para asignar la ubicacion
     * @param ubicacion de la persona
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    /**
     * Metodo para obtener los dias trabajados
     * @return dias trabajados
     */
    public int getDiasTrab() {
        return diasTrab;
    }
    /**
     * Metodo para asignar los dias trabajados
     * @param diasTrab Dias trabajados de la persona
     */
    public void setDiasTrab(int diasTrab) {
        this.diasTrab = diasTrab;
    }
    
}
