package impuesto;

public class Ciudad {
	
	
	    String nombre;
	    int habitantes;
	    double imp1, imp2, imp3, imp4, imp5;
	    double gastosMantenimiento;

	  public   Ciudad(String nombre, int habitantes, double imp1, double imp2, double imp3, double imp4, double imp5, double gastosMantenimiento) {
	        this.nombre = nombre;
	        this.habitantes = habitantes;
	        this.imp1 = imp1;
	        this.imp2 = imp2;
	        this.imp3 = imp3;
	        this.imp4 = imp4;
	        this.imp5 = imp5;
	        this.gastosMantenimiento = gastosMantenimiento;
	    }

	     public double calcularRecaudacionTotal() {
	        return ((imp1 + imp2 + imp3 + imp4 + imp5 )* habitantes);
	    }
	     
	    
	    public String getSituacionFiscal() {
	    	if(calcularRecaudacionTotal()> gastosMantenimiento) {
	    		return "superavit fical";
	    	}else {
	    		return "deficit fiscal";
	    	}
	    }
	    
	    public int getCanthabitantes() {
			   return habitantes;
		   }
	    
	}



