package impuesto;

public class Main_impuestos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Ciudad ciudad1= new Ciudad("Ciudad1", 500, 200, 140, 300, 150, 240, 200000);
		Ciudad ciudad2= new Ciudad("Ciudad2", 500, 200, 140, 300, 150, 240, 200000);
		Ciudad ciudad3= new Ciudad("Ciudad3", 500, 200, 140, 300, 150, 240, 200000);
		Ciudad ciudad4= new Ciudad("Ciudad4", 500, 200, 140, 300, 150, 240, 200000);
		Ciudad ciudad5= new Ciudad("Ciudad5", 500, 200, 140, 300, 150, 240, 200000);
		
		Ciudad ciudad6= new Ciudad("Ciudad1", 5000, 200, 140, 300, 150, 240, 200000);
		Ciudad ciudad7= new Ciudad("Ciudad2", 5000, 200, 140, 300, 150, 240, 200000);
		Ciudad ciudad8= new Ciudad("Ciudad3", 5000, 200, 140, 300, 150, 240, 200000);
		Ciudad ciudad9= new Ciudad("Ciudad4", 5000, 200, 140, 300, 150, 240, 200000);
		Ciudad ciudad10= new Ciudad("Ciudad5", 5000, 200, 140, 300, 150, 240, 200000);
		
		Provincia provincia1 = new Provincia("Provincia1");
		Provincia provincia2 = new Provincia("Provincia2");
		Provincia provincia3 = new Provincia("Provincia3");
		
		
		provincia1.agregarCiudad(ciudad1);
		provincia1.agregarCiudad(ciudad2);
		provincia1.agregarCiudad(ciudad3);
		provincia1.agregarCiudad(ciudad4);
		provincia1.agregarCiudad(ciudad5);
		
		provincia2.agregarCiudad(ciudad6);
		provincia2.agregarCiudad(ciudad7);
		provincia2.agregarCiudad(ciudad8);
		provincia2.agregarCiudad(ciudad9);
		provincia2.agregarCiudad(ciudad10);
		
		provincia3.agregarCiudad(ciudad1);
		provincia3.agregarCiudad(ciudad2);
		provincia3.agregarCiudad(ciudad3);
		provincia3.agregarCiudad(ciudad4);
		

		System.out.println("La recaudacion total de la provinvia1 es: " + provincia1.calcularIngresosTotales());
		 provincia1.getSitFiscalCiudades();
		 provincia2.getSitFiscalCiudades();
		
		
		
		
	}

}
