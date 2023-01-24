package MultihiloJuego;

public class Evento extends Thread {

	public Evento(String tipoEvento, int frecuenciaSegundosAparacion, int longitudPantallaHorizontal,
			int longitudPantallaVertical) {
		super();
		this.tipoEvento = tipoEvento;
		this.frecuenciaSegundosAparacion = frecuenciaSegundosAparacion;
		this.longitudPantallaHorizontal = longitudPantallaHorizontal;
		this.longitudPantallaVertical = longitudPantallaVertical;
	}

	@Override
	public void run() {
       
		
		iniciar();
	}

	private String tipoEvento;
	private int frecuenciaSegundosAparacion;
	private int longitudPantallaHorizontal;
	private int longitudPantallaVertical;

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getFrecuenciaSegundosAparacion() {
		return frecuenciaSegundosAparacion;
	}

	public void setFrecuenciaSegundosAparacion(int frecuenciaSegundosAparacion) {
		this.frecuenciaSegundosAparacion = frecuenciaSegundosAparacion;
	}

	public int getLongitudPantallaHorizontal() {
		return longitudPantallaHorizontal;
	}

	public void setLongitudPantallaHorizontal(int longitudPantallaHorizontal) {
		this.longitudPantallaHorizontal = longitudPantallaHorizontal;
	}

	public int getLongitudPantallaVertical() {
		return longitudPantallaVertical;
	}

	public void setLongitudPantallaVertical(int longitudPantallaVertical) {
		this.longitudPantallaVertical = longitudPantallaVertical;
	}

	public void iniciar()
	{
		
		while(true)
		{
			try {
				Thread.sleep(frecuenciaSegundosAparacion *1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int x= (int)(Math.random() * (longitudPantallaHorizontal-0));
			int y= (int)(Math.random() * (longitudPantallaVertical-0));
			System.out.println(tipoEvento + " x: "+ x +" y:" + y);
			
		}
		
		
	}
	
}
