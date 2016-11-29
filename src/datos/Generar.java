package datos;
import java.io.*;
import javax.swing.*;

public class Generar {
	Integer aleatorio;
	String[] nombres, apellidos, id, numControl, email, telFijos, direcciones, cp, cel, combinacion;
	BufferedReader br;
	
	public Integer aleatorio(){
        aleatorio = (int)(Math.random()*1000);
        return aleatorio;
    }
	
	public String[] leerNombres(){
		nombres = new String[1000];
		String cadena;
		Integer contador = 0;
	      try{
	    	  BufferedReader br = new BufferedReader(new FileReader("Nombres.txt"));
	    	  while((cadena = br.readLine()) != null && contador < 1000){
	    		  nombres[contador] = cadena;
	    		  contador++;
	    	  }
	    	  br.close();
	      } catch (IOException e) {
	    	  JOptionPane.showMessageDialog(null, "Ocurrió un error al leer el archivo.");
	      }
	      return nombres;
	}
	
	public String[] leerApellidos(){
		apellidos = new String[1000];
		String cadena;
		Integer contador = 0;
	      try{
	    	  BufferedReader br = new BufferedReader(new FileReader("Apellidos.txt"));
	    	  while((cadena = br.readLine()) != null && contador < 1000){
	    		  apellidos[contador] = cadena;
	    		  contador++;
	    	  }
	    	  br.close();
	      } catch (IOException e) {
	    	  JOptionPane.showMessageDialog(null, "Ocurrió un error al leer el archivo.");
	      }
	      return apellidos;
	}
	
	public String[] leerId(){
		id = new String[1000];
		String cadena;
		Integer contador = 0;
	      try{
	    	  BufferedReader br = new BufferedReader(new FileReader("Id.txt"));
	    	  while((cadena = br.readLine()) != null && contador < 1000){
	    		  id[contador] = cadena;
	    		  contador++;
	    	  }
	    	  br.close();
	      } catch (IOException e) {
	    	  JOptionPane.showMessageDialog(null, "Ocurrió un error al leer el archivo.");
	      }
    	  return id;
	}
	
	public String[] leerNumControl(){
		numControl = new String[1000];
		String cadena;
		Integer contador = 0;
	      try{
	    	  BufferedReader br = new BufferedReader(new FileReader("NumControl.txt"));
	    	  while((cadena = br.readLine()) != null && contador < 1000){
	    		  numControl[contador] = cadena;
	    		  contador++;
	    	  }
	    	  br.close();
	      } catch (IOException e) {
	    	  JOptionPane.showMessageDialog(null, "Ocurrió un error al leer el archivo.");
	      }
    	  return numControl;
	}
	
	public String[] leerEmail(){
		email = new String[1000];
		String cadena;
		Integer contador = 0;
	      try{
	    	  BufferedReader br = new BufferedReader(new FileReader("Email.txt"));
	    	  while((cadena = br.readLine()) != null && contador < 1000){
	    		  email[contador] = cadena;
	    		  contador++;
	    	  }
	    	  br.close();
	      } catch (IOException e) {
	    	  JOptionPane.showMessageDialog(null, "Ocurrió un error al leer el archivo.");
	      }
    	  return email;
	}
	
	public String[] leerTelFijos(){
		telFijos = new String[1000];
		String cadena;
		Integer contador = 0;
	      try{
	    	  BufferedReader br = new BufferedReader(new FileReader("Telefonos Fijos.txt"));
	    	  while((cadena = br.readLine()) != null && contador < 1000){
	    		  telFijos[contador] = cadena;
	    		  contador++;
	    	  }
	    	  br.close();
	      } catch (IOException e) {
	    	  JOptionPane.showMessageDialog(null, "Ocurrió un error al leer el archivo.");
	      }
    	  return telFijos;
	}
	
	public String[] leerDirecciones(){
		direcciones = new String[1000];
		String cadena;
		Integer contador = 0;
	      try{
	    	  BufferedReader br = new BufferedReader(new FileReader("Direcciones.txt"));
	    	  while((cadena = br.readLine()) != null && contador < 1000){
	    		  direcciones[contador] = cadena;
	    		  contador++;
	    	  }
	    	  br.close();
	      } catch (IOException e) {
	    	  JOptionPane.showMessageDialog(null, "Ocurrió un error al leer el archivo.");
	      }
    	  return direcciones;
	}
	
	public String[] leerCP(){
		cp = new String[1000];
		String cadena;
		Integer contador = 0;
	      try{
	    	  BufferedReader br = new BufferedReader(new FileReader("CP.txt"));
	    	  while((cadena = br.readLine()) != null && contador < 1000){
	    		  cp[contador] = cadena;
	    		  contador++;
	    	  }
	    	  br.close();
	      } catch (IOException e) {
	    	  JOptionPane.showMessageDialog(null, "Ocurrió un error al leer el archivo.");
	      }
    	  return cp;
	}
	
	public String[] leerCelulares(){
		cel = new String[1000];
		String cadena;
		Integer contador = 0;
	      try{
	    	  BufferedReader br = new BufferedReader(new FileReader("Celulares.txt"));
	    	  while((cadena = br.readLine()) != null && contador < 1000){
	    		  cel[contador] = cadena;
	    		  contador++;
	    	  }
	    	  br.close();
	      } catch (IOException e) {
	    	  JOptionPane.showMessageDialog(null, "Ocurrió un error al leer el archivo.");
	      }
    	  return cel;
	}
	
	public void generar(Integer cant, String... elementos){
//		Integer cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de datos a generar:"));
		String dato = null;
		combinacion = new String[cant];
		leerNombres();
		leerApellidos();
		leerId();
        Integer cont = 0;
        
        try{
            File archivoSalida = new File("Datos.txt");
            PrintWriter out = new PrintWriter(new PrintWriter(archivoSalida));
        
           while(cont < cant){
        	   dato = nombres[aleatorio()] + " " + apellidos[aleatorio()] + " " + id[aleatorio()];
//        	   for(int i = 0; i < elementos.length; i++)
//        		   dato += elementos[i]; 
//        	   combinacion[cont] = dato;  
        	   cont++;
        	   out.println(dato);
           }
            out.close();
        }catch (IOException ioe) {
        	System.out.println("Error al intentar abrir el archivo.");
        }
	}
	
//	public static void main(String[] args) {
//		Generar g = new Generar();
//		String[] nom, ap, id;
//		nom = g.leerNombres();
//		ap = g.leerApellidos();
//		id = g.leerId();
//	}
}
