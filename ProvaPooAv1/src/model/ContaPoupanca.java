package model;

public class ContaPoupanca {
	
	int numconta;
	int codcliente;
	double saldo;
	double taxajuros;
	
	public ContaPoupanca () 
	{
		
	}
	
	public ContaPoupanca (int numconta, int codcliente) 
	{
		this.numconta = numconta;
		this.codcliente = codcliente;
		
	}

	public int getNumconta() {
		return numconta;
	}

	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}

	public int getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(int codcliente) {
		this.codcliente = codcliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxajuros() {
		return taxajuros;
	}

	public void setTaxajuros(double taxajuros) {
		this.taxajuros = taxajuros;
	}
	
	public void Cadastrar() {
		this.taxajuros = 0.05;
	}
	
	public void CreditarRendimentos() {
		double rendimentos = (this.saldo * 0.05);
		this.saldo = this.saldo + rendimentos;
	}
}
