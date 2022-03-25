package geometria;

public class Circulo {
	private double raio; 
	private double pi = 3.14;
	public void setRaio(double raio) {
		if(raio >0) {
			this.raio = raio;
			
		}
	}
	public double calcularArea() {
		double area = pi * raio * raio;
		return area;
	}
	
}
