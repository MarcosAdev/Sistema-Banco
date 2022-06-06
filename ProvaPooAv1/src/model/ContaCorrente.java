package model;

public class ContaCorrente {
	
	int numconta;
	int codcliente;
	double saldo;
	double creditoespecial;
	
	public ContaCorrente() {
		
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
	public void setNomecliente(int codcliente) {
		this.codcliente = codcliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getCreditoespecial() {
		return creditoespecial;
	}
	public void setCreditoespecial(double creditoespecial) {
		this.creditoespecial = creditoespecial;
	}

}
