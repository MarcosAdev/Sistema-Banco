package model;

public class ClienteCorrentista {
	
	int codcliente;
	String nomecliente;
	String datacadastro;
	ContaCorrente contacorrente;
	ContaPoupanca contapoupanca;
		
	public ClienteCorrentista (int codcliente) {
		this.codcliente = codcliente;		
	}

	public int getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(int codcliente) {
		this.codcliente = codcliente;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(String datacadastro) {
		this.datacadastro = datacadastro;
	}

	public ContaCorrente getContacorrente() {
		return contacorrente;
	}

	public void setContacorrente(ContaCorrente contacorrente) {
		this.contacorrente = contacorrente;
	}

	public ContaPoupanca getContapoupanca() {
		return contapoupanca;
	}

	public void setContapoupanca(ContaPoupanca contapoupanca) {
		this.contapoupanca = contapoupanca;
	}
	
	// 1 - poupanca -> cc
	// 2 - cc -> poupanca
	public void Transferencia(int tipo, double valortransferencia) 
	{
		
		switch(tipo) 
		{
		
		case 1:
			if(this.contapoupanca.getSaldo() >= valortransferencia) 
			{
				double novosaldo = this.contacorrente.getSaldo() + valortransferencia;
				this.contacorrente.setSaldo(novosaldo);
				double novapoupanca = this.contapoupanca.getSaldo() - valortransferencia;
				this.contapoupanca.setSaldo(novapoupanca);
			}
			
			else
			{
				System.out.println("Saldo Insuficiente!");
			}
		break;
		case 2:
			if(this.contacorrente.getSaldo() >= valortransferencia) 
			{
				double novosaldo = this.contapoupanca.getSaldo() + valortransferencia;
				this.contapoupanca.setSaldo(novosaldo);
				double novasaldoCC = this.contacorrente.getSaldo() - valortransferencia;
				this.contacorrente.setSaldo(novasaldoCC);
			}
			
			else
			{
				System.out.println("Saldo Insuficiente!");
			}
		break;
		}
		
	}
	
	public void ExcluirPoupanca () 
	{
		if(this.contapoupanca.getSaldo() > 0) {
			System.out.println("Por favor, zere o saldo antes de fechar a conta!");
		}
		else {
			this.contapoupanca = null;
			System.out.println("Poupança encerrada com sucesso!");
		}
	}
	
	public void Imprimir () 
	{
		System.out.println("Cod Correntista: " + getCodcliente());
		System.out.println("Nome Correntista: " + getNomecliente());
		System.out.println("Cliente desde: " + getDatacadastro());
		System.out.println("Num conta          Tipo da Conta          Saldo");
		System.out.println("---------" + "          " + "-------------------" + "    " + "------");
		System.out.println(getContacorrente().getNumconta() + "          " + "CC8" + "          " + getContacorrente().getSaldo());
		if(getContapoupanca() != null) 
		{
			System.out.println(getContapoupanca().getNumconta() + "          " + "CP" + "          " + getContapoupanca().getSaldo());
		}
	}

}
