package polimorfismo;

public class Gto extends Animal {
	
	public Gto(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("o gato esta miando");
	}
}


