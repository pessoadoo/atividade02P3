package br.cesed.si.p3.exercicio02;

public class Utils {
	
	private double c;
	
	private double f;

	
	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public Utils(double c, double f) {
		this.c = c;
		this.f = f;
	}

	public void toCelsius() throws FahrenheitException {
		
		c = 5*(f-32)/9;
		
		if(c < -459.67) {
			throw new FahrenheitException();
		} 
	}
}
