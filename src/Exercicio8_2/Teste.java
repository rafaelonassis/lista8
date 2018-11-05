package Exercicio8_2;


public class Teste {
	public static void main(String[] args) {

		NoticiarioAssina noticiario = new NoticiarioAssina();
		
		new Consumidor("Rafael", noticiario);
		noticiario.notificaNoticia(" Novo jogador do Brasil ", 28, 10, "Tópico: Futebol");
		
		new Consumidor("Onassis", noticiario);
		noticiario.notificaNoticia(" Cria um novo Game ", 30, 10, "Tópico: Música");

	}
}
