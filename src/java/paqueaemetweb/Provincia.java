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
public class Provincia {
    private String provincia;
    private int id_provincia;

    public Provincia(String provincia, int id_provincia) {
        this.provincia = provincia;
        this.id_provincia = id_provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }
    
    
    
    
}
