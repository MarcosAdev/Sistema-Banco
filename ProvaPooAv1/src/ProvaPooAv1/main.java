package ProvaPooAv1;

import model.*;
import util.*;

public class main {
	
	static ClienteCorrentista[] clientes;
	static int cont;

	public static void main(String[] args) 
	{
		cont = 0;
		int opcao;
		clientes = new ClienteCorrentista[10];
		do {
			opcao = Keyboard.menu("Cadastrar/Listar todos/Excluir Cliente/Excluir PP/Saque/Deposito/Consultar Cliente/Terminar");
			switch (opcao) 
			{
				case 1: 
					Cadastrar();
					break;
				case 2: 
					ListarTodos();
					break;
				case 3: 
					//ExcluirCliente();
					break;
				case 4: 
					//ExcluirPoupanca();
					break;
				case 5: 
					//Sacar();
					break;
				case 6: 
					//Depositar();
					break;
				case 7: 
					//ConsultarCliente();
					break;								
				
				default:
					System.out.println("Até logo!");
			}
		} while(opcao < 8);
	}

	private static void ListarTodos() 
	{
		for(int i = 0; i < cont; i++) 
		{
			clientes[i].Imprimir();
		}
	}

	private static void Cadastrar() {
		ClienteCorrentista cliente;
		cliente = new ClienteCorrentista(Keyboard.readInt("Codigo conta: "));
		cliente.setNomecliente(Keyboard.readString("Nome: "));
		
		ContaCorrente cc = new ContaCorrente();
		cc.setNomecliente(cliente.getCodcliente());
		cc.setSaldo(100);
		cc.setCreditoespecial(100);
		
		cliente.setContacorrente(cc);
		
		clientes[cont] = cliente;	
		cont++;
	}
}
