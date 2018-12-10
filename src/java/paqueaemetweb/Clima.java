/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueaemetweb;

import java.util.ArrayList;

public class Clima {
private String municipio, provincia;
private ArrayList<Dia> lista_dias=new ArrayList();
public Clima(String municipio, String provincia, ArrayList<Dia> lista_dias) {
	super();
	this.municipio = municipio;
	this.provincia = provincia;
	this.lista_dias = lista_dias;
}
public String getMunicipio() {
	return municipio;
}
public void setMunicipio(String municipio) {
	this.municipio = municipio;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}
public ArrayList<Dia> getLista_dias() {
	return lista_dias;
}
public void setLista_dias(ArrayList<Dia> lista_dias) {
	this.lista_dias = lista_dias;
}

}