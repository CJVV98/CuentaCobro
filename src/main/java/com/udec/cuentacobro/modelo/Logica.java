/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentacobro.modelo;
import com.udec.cuentacobro.controlador.Cuenta;

/**
 * Clase encargada de calcular los datos
 * @author Corin V
 */
public class Logica {
    /**
     * Valida que la informacion no este vacia
     * @param nombre de la persona
     * @param apellido de la persona
     * @param dias de trabajo
     * @return boolean
     */
    public boolean validar(String nombre, String apellido, int dias){
        if(dias<=0 || nombre.length()<=0 || apellido.length()<=0){
            return true;
        }else{
            return false;
        }       
    }
    /**
     * calcula el sueldo de la persona
     * @param profesion de la persona
     * @param idiomas que habla la persona
     * @param ubicacion de la persona
     * @param diasTrab dias Trabajados
     * @return sueldo
     */
    public int calcularSueldo(String profesion, String[] idiomas, String ubicacion, int diasTrab) {
        int valProfesion=calcularProfesion(profesion)*diasTrab;
        int valIdiomas=calcularIdiomas(idiomas);
        int valUbicacion=calcularUbicacion(ubicacion);
        return valProfesion+valIdiomas+valUbicacion;
    }
    /**
     * Calcula el monto por la profesion
     * @param profesion de la persona
     * @return valor por profesion
     */
    private int calcularProfesion(String profesion) {
        switch(profesion){
            case "Ingeniero":
                return 200000;
            case "Tecnologo": 
                return 180000;
            case "Tecnico": 
                return 100000;
            case "Auxiliar": 
                return 80000;
        }
        return 0;
    }
    /**
     * Calcula el monto por idioma
     * @param idiomas que habla la persona
     * @return valor total por idiomas
     */
    private int calcularIdiomas(String[] idiomas) {
        int acumulador=0;
        for (String idioma : idiomas) {
            switch(idioma){
                case "Ingles":
                    acumulador+=250000;
                    break;
                case "Frances":
                    acumulador+=330000;
                    break;
                case "Aleman":
                    acumulador+=500000;
                    break;
            }
        }
        return acumulador;
    }
    /**
     * Calcula el monto por ubicacion
     * @param ubicacion de la persona
     * @return monto por ubicacion
     */
    private int calcularUbicacion(String ubicacion) {
        if("Afueras".equals(ubicacion))
            return 80000;
        else
            return 0;
    }
    /**
     * Guarda la informacion a mostrar en la vista
     * @param persona Cuenta informacion de la persona
     * @return vector con los datos a mostrar
     */
    public String[] validarDatos(Cuenta persona) {
        String[] datos=new String[7];
        int i=0;
        datos[i]="Cuenta de Cobro";
        if(persona.getGenero().equals("M"))
            datos[i++]="Señora: "+persona.getNombre()+" "+persona.getApellido();
        else
            datos[i++]="Señor: "+persona.getNombre()+" "+persona.getApellido();      
        datos[i++]="Por su profesion:  "+persona.getProfesion();
        if(persona.getIdiomas().length>0){
            int dato=i++;
            datos[dato]="Y sus idiomas en:   ";
            for (String idioma : persona.getIdiomas()) {
                datos[dato]+=idioma+" ";
            }   
        }
        if("Afueras".equals(persona.getUbicacion()))
            datos[i++]="Su ubicacion en las afueras de la ciudad ";
        datos[i++]="Sus dias trabajados "+persona.getDiasTrab();
        int valor=calcularSueldo(persona.getProfesion(),persona.getIdiomas(),persona.getUbicacion(),persona.getDiasTrab());   
        datos[i++]="SU CUENTA ES POR  $ "+valor;
     return datos;   
     }

}
