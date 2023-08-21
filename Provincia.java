package impuesto;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
	
	    String nombre;
	    List<Ciudad> ciudades;

	     public Provincia(String nombre) {
	        this.nombre = nombre;
	        this.ciudades = new ArrayList<>();
	    }

	   public  void agregarCiudad(Ciudad ciudad) {
	        ciudades.add(ciudad);
	    }

	   public  double calcularGastosTotales() {
	        double gastosTotales = 0;
	        for (Ciudad ciudad : ciudades) {
	            gastosTotales += ciudad.gastosMantenimiento;
	        }
	        return gastosTotales;
	    }
	    
	   public   double calcularIngresosTotales() {
	        double ingresosTotales = 0;
	        for (Ciudad ciudad : ciudades) {
	            ingresosTotales += ciudad.calcularRecaudacionTotal();
	        }
	        return ingresosTotales;
	    }
	   
	   public void getSitFiscalCiudades() {
		   
		   for(Ciudad ciudad : ciudades) {
			   System.out.println(ciudad.nombre+ " --" + ciudad.getSituacionFiscal());
		   }
	   }
	   
	   public int getCantCiudades() {
		   return ciudades.size();
	   }
	   
	  
	   
	}




