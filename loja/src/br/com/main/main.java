package br.com.main;

import br.com.classes.veiculo;

public class main {

	public static void main(String[] args) {
		
		//iniciando objeto
		veiculo carro = new veiculo();
		carro.nome = "Corsa";
		carro.cor = "Amarelo";
		carro.motor = "16cv";
		carro.velocidade = 100;
        
        System.out.println("Nome: "+ carro.nome);
        System.out.println("Nome: "+ carro.cor);
        System.out.println("Nome: "+ carro.motor);
        System.out.println("Nome: "+ carro.velocidade);
        
        carro.ligar();
        
        carro.nome = "Lamborghini";
		carro.cor = "Preto";
		carro.motor = "17cv";
    	carro.velocidade = 200;
      
    	System.out.println("Nome: "+ carro.nome);
    	System.out.println("Nome: "+ carro.cor);
    	System.out.println("Nome: "+ carro.motor);
      	System.out.println("Nome: "+ carro.velocidade);
      
      	carro.ligar();
      
	}

}
