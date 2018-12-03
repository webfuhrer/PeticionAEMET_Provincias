/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueaemetweb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mañanas
 */
public class AccesoBD {
    public static ArrayList<Provincia> recuperarProvincias()
    {
         ArrayList<Provincia> lista=new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/bd_municipios";
            Connection conexion=DriverManager.getConnection(url,"root","");
            Statement stmt=conexion.createStatement();
            String query="SELECT * FROM provincias";
            ResultSet rs=stmt.executeQuery(query);
           
            while(rs.next())
            {
                String provincia=rs.getString("provincia");
                int id_provincia=rs.getInt("id_provincia");
                Provincia p=new Provincia(provincia, id_provincia);
                lista.add(p);
                
            }
            stmt.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     return lista;           
                
    }

    static ArrayList<Municipio> recuperarMunicipiosPorProvincia(String provincia) {
        ArrayList<Municipio> lista=new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/bd_municipios";
            Connection conexion=DriverManager.getConnection(url,"root","");
            Statement stmt=conexion.createStatement();
            String query="SELECT * FROM municipios WHERE id_provincia="+provincia;
            ResultSet rs=stmt.executeQuery(query);
           
            while(rs.next())
            {
                String nombre=rs.getString("nombre");
                String cod_municipio=rs.getString("cod_municipio");
                // public Municipio(String cod_municipio, String id_provincia, String nombre)
                Municipio m=new Municipio(cod_municipio, provincia, nombre);
                lista.add(m);
                
            }
            stmt.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     return lista;     
    }
}
