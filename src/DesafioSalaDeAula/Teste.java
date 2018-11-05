package DesafioSalaDeAula;

public class Teste {

	public static void main(String[] args) {
		EstacaoDeMonitoramento estacao = new EstacaoDeMonitoramento();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
		ForeCastDisplay sa = new ForeCastDisplay();
		StatsDisplay status = new StatsDisplay();
		estacao.addObserver(currentConditionsDisplay);
		estacao.addObserver(status);
		estacao.addObserver(sa);
		estacao.vai();
		
		

	}

}
