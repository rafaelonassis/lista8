package DesafioSalaDeAula;

public class StatsDisplay implements Observer {

	private double historico;
	private int quantidade;
	
	@Override
	public void update(double temp, double humidity, double pressure) {
		historico += temp;
		quantidade++;
		double media = historico / quantidade;
		System.out.println("--------------M�dia Hist�rica--------------");
		System.out.println("M�dia hist�rica: " + media);

	}

}
