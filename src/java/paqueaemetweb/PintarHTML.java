/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueaemetweb;

import java.util.ArrayList;

/**
 *
 * @author Mañanas
 */
public class PintarHTML {
    public static String crearCombo(ArrayList<Municipio> lista)
    {
        String html="<select name='municipio'>";
        for (Municipio municipio : lista) {
            html+="<option value='"+municipio.getCod_municipio()+"'>"+municipio.getNombre()+"</option>";
        }
        html+="</select>";
        return html;
    }
    public static String crearTabla(Clima clima)
    {
        ArrayList<Dia> lista_dias=clima.getLista_dias();
        String aux_tabla="<table>";
        aux_tabla+="<tr><th>Fecha</th><th>Temp. minima</th><th>Temp. máxima</th</tr>";
        for (Dia dia : lista_dias) {
            aux_tabla+="<tr><td>"+dia.getFecha()+"</td><td>"+dia.getT_minima()+"</td><td>"+dia.getT_maxima()+"</td></tr>";
        }
        aux_tabla+="</table>";
                return aux_tabla;
    }
    
}
