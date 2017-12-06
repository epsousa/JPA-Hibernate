package br.com.fiap.start;

import java.util.Date;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pedido;
import br.com.fiap.helpers.ClienteHelper;

public class TestarExercicio {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		
		cli.setEmail("evairpereirasousa@hotmail.com");
		cli.setNome("Evair Sousa");
		
		ClienteHelper cliHelper = new ClienteHelper(Cliente.class);
		
		cliHelper.adicionar(cli);
		
		GenericDao<Pedido> pedidoHelper = new GenericDao<>(Pedido.class);
		
		Pedido pedido = new Pedido();
		
		pedido.setDescricao("Livro2");
		pedido.setData(new Date());
		pedido.setValor(90D);
	
		pedidoHelper.adicionar(pedido);
		
		cli.setPedido(pedido);
		
		cliHelper.atualizar(cli);
		
		Pedido pedido2 = new Pedido();
		
		pedido2.setDescricao("Livro");
		pedido2.setData(new Date());
		pedido2.setValor(100D);
	
		pedidoHelper.adicionar(pedido2);
	
		System.out.println(pedidoHelper.listar()); 		
		
		pedidoHelper.remover(pedido2);
		
		System.out.println(pedidoHelper.buscar(pedido.getIdPedido()));
				
	
		System.out.println("Terminou");

	}

}
