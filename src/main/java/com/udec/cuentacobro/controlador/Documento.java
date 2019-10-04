/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentacobro.controlador;

import com.udec.cuentacobro.modelo.Logica;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.inject.Inject;

/**
 * Controlador de la vista Documentos, imprime la cuenta de cobro generada
 * @author Corin V
 */
@Named(value = "documento")
@RequestScoped
public class Documento{
    /**
     * nombre, obtiene el titulo de la pagina
     * datos, es l informacion a mostrar
     * cuenta, en esta se realiza una inyeccion a la clase Cuenta, debido a la dependencia
     */
    private String nombre;
    private String[] datos;
    @Inject 
    private Cuenta cuenta;
   
    
    /**
     * Constructor del controlador
     */
   
    @PostConstruct
    public void obtenerInformacion(){
        traerModelo();
    }

    /**
     * Obtiene los datos a mostrar
     * @return datos a mostrar
     */

    public String[] getDatos() {
        return datos;
    }
    /**
     * Asigna los datos 
     * @param datos a mostrar
     */
    public void setDatos(String[] datos) {
        this.datos = datos;
    }
    /**
     * Obtiene la clase cuenta
     * @return controlador cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }
    /**
     * Asigna la clase cuenta
     * @param cuenta  clase
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Obtiene el nombre de la cabecera
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Asigna el nombre de la cabecera
     * @param nombre de la cabecera
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Validaciones de la informacion ingresada y llamado a logica
     */
    private void traerModelo() {
        Logica logica=new Logica();   
        boolean dato=logica.validar(cuenta.getNombre(), cuenta.getApellido(), cuenta.getDiasTrab());
        if(dato){     
            nombre="Error al Generar Cuenta de Cobro verifique datos";
        }else{
            nombre="CUENTA DE COBRO 001";
            datos=logica.validarDatos(cuenta);
        }
        
    }
    
    
}
