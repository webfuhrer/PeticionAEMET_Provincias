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
public class Dia {
private String fecha;
private int t_minima, t_maxima;
public Dia(String fecha, int t_minima, int t_maxima) {
	
	this.fecha = fecha;
	this.t_minima = t_minima;
	this.t_maxima = t_maxima;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public int getT_minima() {
	return t_minima;
}
public void setT_minima(int t_minima) {
	this.t_minima = t_minima;
}
public int getT_maxima() {
	return t_maxima;
}
public void setT_maxima(int t_maxima) {
	this.t_maxima = t_maxima;
}

}
