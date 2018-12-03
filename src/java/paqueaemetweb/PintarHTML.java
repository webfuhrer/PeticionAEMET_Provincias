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
    
}
