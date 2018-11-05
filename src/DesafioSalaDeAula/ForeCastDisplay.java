package DesafioSalaDeAula;

//trocar para HeatIndexDisplay
public class ForeCastDisplay implements Observer{

	private double c1 = -42.379;
	private double c2 = 2.04901526;
	private double c3 = 10.14333127;
	private double c4 = -0.22475541;
	private double c5 = -6.83783 * -6.83783 * -6.83783;
	private double c6 = 5.481717 * 5.481717;
	private double c7 = 1.22874 * 1.22874 * 1.22874;
	private double c8 = 8.5282 * 8.5282 * 8.5282 * 8.5282;
	private double c9 = 1.99 * 1.99 *1.99 *1.99 *1.99 *1.99;
	private double sensacao = c1+c2+c3+c4+c5+c6+c7+c8+c9;
	
	@Override
	public void update(double temp, double humidity, double pressure) {
		
		System.out.println("--------------Sensação Térmica--------------");
		System.out.println("Sensação: " + sensacao);
	}
	
}
