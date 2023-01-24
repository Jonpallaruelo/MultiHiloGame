package MultihiloJuego;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evento eventoOrco= new Evento("orco",4,600,800);
		Evento eventoCienaga= new Evento("Cienaga",2,600,800);
		Evento eventoErupcionVolcanica= new Evento("erupcionVolcanica",3,600,800);
		
		eventoOrco.start();
		eventoCienaga.start();
		eventoErupcionVolcanica.start();

	}
        
	
}
