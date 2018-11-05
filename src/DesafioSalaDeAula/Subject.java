package DesafioSalaDeAula;

//todo observavel implementa
public interface Subject {
	public void addObserver (Observer o);
	public void removeObserver (Observer o);
	public void notifyObservers ();
}
