package DesafioSalaDeAula;

public class CurrentConditionsDisplay implements Observer {

	@Override
	public void update(double temp, double humidity, double pressure) {
		System.out.println("--------------Condi��es Atuais--------------");
		System.out.printf("Temp atual: %.2f\nHumidade: %.2f\nPress�o: %.2f\n", temp, humidity, pressure);
		
	}

	

}
