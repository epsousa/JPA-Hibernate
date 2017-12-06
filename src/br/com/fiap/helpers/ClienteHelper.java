package br.com.fiap.helpers;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cliente;

public class ClienteHelper extends GenericDao<Cliente> {

	public ClienteHelper(Class<Cliente> classe) {
		super(classe);
	}
}
