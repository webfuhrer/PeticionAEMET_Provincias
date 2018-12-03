/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueaemetweb;

/**
 *
 * @author Mañanas
 */
public class Municipio {
    private String cod_municipio, id_provincia, nombre;

    public Municipio(String cod_municipio, String id_provincia, String nombre) {
        this.cod_municipio = cod_municipio;
        this.id_provincia = id_provincia;
        this.nombre = nombre;
    }

    public String getCod_municipio() {
        return cod_municipio;
    }

    public String getId_provincia() {
        return id_provincia;
    }

    public String getNombre() {
        return nombre;
    }
    
}
