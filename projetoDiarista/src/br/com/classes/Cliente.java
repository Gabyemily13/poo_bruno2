package br.com.classes;

public class Cliente extends Pessoa{

	protected  double saldo;

	@Override
	public void sacar(int valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
	}

	@Override
	public void depositar(int valor) {
		// TODO Auto-generated method stub
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor + (valor * 0.1);
		this.setSaldo(novoSaldo);
		
		
	}
	
}
