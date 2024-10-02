package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("thor", "M", "qualquer");
		lobo.emitirSom();
		
		Leao leao = new Leao("alas", "M", "qualquer");
		leao.emitirSom();
		
		Tigre tigre = new Tigre("radidi", "F", "qualquer");
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro("pluto", "M", "qualquer");
		cachorro.emitirSom();
		
		Gto gto = new Gto("neko", "f", "qualquer");
		gto.emitirSom();
	}

}
