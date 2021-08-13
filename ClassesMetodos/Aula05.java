package OrientadoObjeto;

public class Aula05 {
	
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(11111);
		p1.setDono("Delson");
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(22222);
		p2.setDono("Joana");
		p2.abrirConta("CP");
		
		p1.depositar(100);
		p2.depositar(50);
		
		p1.sacar(150);
		p1.fecharConta();
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();
		
		
	}

}
