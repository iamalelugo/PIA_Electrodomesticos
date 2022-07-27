
public class Television extends Electrodomesticos {
	
	private int resolucion = 20;
	private boolean sintonizadorTDT = false;
	private int preciofinal;
	
	public Television() {
		super();
	}

	public Television(int preciobase, String color, char consumoenergetico, int peso, int resolucion,
			boolean sintonizadorTDT, int preciofinal) {
		super(preciobase, color, consumoenergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		this.preciofinal = preciofinal;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
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
		
		if(this.sintonizadorTDT == true && this.resolucion >= 40) {
			this.preciofinal = (super.getPreciobase()+(super.getPreciobase()*30)) + 500;
			super.setPreciobase(this.preciofinal);
		}
		else
			if(this.sintonizadorTDT == true && this.resolucion < 40) {
				this.preciofinal = super.getPreciobase()+500;
				super.setPreciobase(this.preciofinal);
			}
			else
				if(this.sintonizadorTDT == false && this.resolucion >=40) {
					this.preciofinal = (super.getPreciobase()+(super.getPreciobase()*30));
					super.setPreciobase(this.preciofinal);
				}
				else 
					if(this.sintonizadorTDT == false && this.resolucion <40) {
						this.setPreciofinal(super.getPreciobase());
						super.setPreciobase(this.preciofinal);
					}
		}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Television {Reseolucion = " +this.getResolucion()+ "Sintonizador TDT =" +this.isSintonizadorTDT()+ '}';
	}
	
	
	
}
