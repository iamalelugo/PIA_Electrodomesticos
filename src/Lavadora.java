
public class Lavadora extends Electrodomesticos {
	
	private int carga = 5;
	private int preciofinal;

	public Lavadora() {
		super();
	}

	public Lavadora(int preciobase, String color, char consumoenergetico, int peso, int carga, int preciofinal) {
		super(preciobase, color, consumoenergetico, peso);
		this.carga = carga;
		this.preciofinal = preciofinal;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getPreciofinal() {
		return preciofinal;
	}

	public void setPreciofinal(int preciofinal) {
		this.preciofinal = preciofinal;
	}

	@Override
	public int getPreciobase() {
		// TODO Auto-generated method stub
		return super.getPreciobase();
	}

	@Override
	public void setPreciobase(int preciobase) {
		// TODO Auto-generated method stub
		super.setPreciobase(preciobase);
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public char getConsumoenergetico() {
		// TODO Auto-generated method stub
		return super.getConsumoenergetico();
	}

	@Override
	public void setConsumoenergetico(char consumoenergetico) {
		// TODO Auto-generated method stub
		super.setConsumoenergetico(consumoenergetico);
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return super.getPeso();
	}

	@Override
	public void setPeso(int peso) {
		// TODO Auto-generated method stub
		super.setPeso(peso);
	}

	@Override
	public void comprobarConsumoEnergetico(char letra) {
		// TODO Auto-generated method stub
		super.comprobarConsumoEnergetico(letra);
	}

	@Override
	public void comprobarColor(String color) {
		// TODO Auto-generated method stub
		super.comprobarColor(color);
	}

	@Override
	public void precioFinal() {
		
		if(this.carga >= 30) {
			this.setPreciofinal(super.getPreciobase()+500);
			super.setPreciobase(this.preciofinal);
		}
		else
		{
			this.setPreciofinal(super.getPreciobase());
			super.setPreciobase(this.preciofinal);
		}		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Lavadora {Carga ="+ this.getCarga()+'}';
	}
}
