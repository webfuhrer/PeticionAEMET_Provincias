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
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ParseaXML {

	public static Document convertirStringEnDocument(String xml) {
		// TODO Auto-generated method stub
		SAXBuilder builder=new SAXBuilder();
		InputStream stream;
		Document documento=null;
		try {
			stream = new ByteArrayInputStream(xml.getBytes("UTF-8"));
			documento=builder.build(stream);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				return documento;
	}
	public static Clima parsearXML(Document documento) {
		Clima c=null;
		
		
			
			
			Element elemento_raiz=documento.getRootElement();
			Element elemento_municipio=elemento_raiz.getChild("nombre");
			Element elemento_provincia=elemento_raiz.getChild("provincia");
			String municipio=elemento_municipio.getValue();
			String provincia=elemento_provincia.getValue();
			Element elemento_prediccion=elemento_raiz.getChild("prediccion");
			List<Element> lista_elementos_dia=elemento_prediccion.getChildren("dia");
			/*for (int i=0; i<lista_elementos_dia.size(); i++)
			{
				Element element=lista_elementos_dia.get(i);
			}*/
			ArrayList<Dia> lista_dias=new ArrayList<>();
			for (Element element : lista_elementos_dia) {
				
				Attribute atributo_fecha=element.getAttribute("fecha");
				String fecha_rara=atributo_fecha.getValue();			
				Element elemento_temperatura=element.getChild("temperatura");
				String t_minima=elemento_temperatura.getChild("minima").getValue();
				String t_maxima=elemento_temperatura.getChild("maxima").getValue();
				Dia d=new Dia(fecha_rara, Integer.parseInt(t_minima), Integer.parseInt(t_maxima));
				lista_dias.add(d);
			}
			c=new Clima(municipio, provincia, lista_dias);
				
			//c.setMuicipio(...)
		 
		return c;
	}

}
