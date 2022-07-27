
public class Electrodomesticos {
	
	private int preciobase;
	private String color;
	private char consumoenergetico;
	private int peso;
	
	public Electrodomesticos(int preciobase, String color, char consumoenergetico, int peso) {
		super();
		this.preciobase = preciobase;
		this.color = color;
		this.consumoenergetico = consumoenergetico;
		this.peso = peso;
	}

	public Electrodomesticos() {
		super();
	}

	public int getPreciobase() {
		return preciobase;
	}

	public void setPreciobase(int preciobase) {
		this.preciobase = preciobase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoenergetico() {
		return consumoenergetico;
	}

	public void setConsumoenergetico(char consumoenergetico) {
		this.consumoenergetico = consumoenergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void comprobarConsumoEnergetico(char letra) {
		
		if(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F'){
			this.consumoenergetico = letra;
		}
		else 
			this.consumoenergetico = 'F';
		
	}
	
	public void comprobarColor(String color) {
		if(color == "blanco" || color == "rojo" || color == "azul" || color == "gris" || color == "negro") {
			this.color = color;
		}
		else
			this.color = "blanco";
	}
	
	public void precioFinal() {
		
		switch (this.consumoenergetico){
			
		case 'A' : this.preciobase = this.preciobase + 100;
		case 'B' : this.preciobase = this.preciobase + 800;
		case 'C' : this.preciobase = this.preciobase + 600;
		case 'D' : this.preciobase = this.preciobase + 500;
		case 'E' : this.preciobase = this.preciobase + 300;
		case 'F' : this.preciobase = this.preciobase + 100;
		
		}
		
		if(this.peso >= 0 && this.peso <= 19)
			this.preciobase = this.preciobase + 100;
		else
			if(this.peso >= 20 && this.peso <= 49)
				this.preciobase = this.preciobase + 500;
			else
				if(this.peso >= 50 && this.preciobase <= 70)
					this.preciobase = this.preciobase + 800;
				else 
					if(this.peso >= 80)
						this.preciobase = this.preciobase + 1000;
		
	}

	@Override
	public String toString() {
		return "Electrodomesticos [preciobase=" + preciobase + ", color=" + color + ", consumoenergetico="
				+ consumoenergetico + ", peso=" + peso + "]";
	}
	
	
	
	

}
