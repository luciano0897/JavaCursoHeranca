package projetoManha;



public class CriarVeiculo {

	public static void main(String[] args) {
		
		
		
		
		Carro carro1 = new Carro("Toyota", "Corolla", 2000, 4);
		Carro carro2 = new Carro ("x", "y", 2005, 2);
		
		Moto moto1 = new Moto("Honda", "Yamaha", 0, true);
		
		
		
		System.out.println("Detalhes do carro 1");
		carro1.exibirDetalhes();
		
		System.out.println("\nDetalhes do carro 1");
		carro2.exibirDetalhes();
		
		System.out.println("\nDetalhes do moto 1");
		moto1.exibirDetalhes();
		
		
		
		

	}

}
