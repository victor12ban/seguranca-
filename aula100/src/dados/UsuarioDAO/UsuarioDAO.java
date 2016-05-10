package dados.UsuarioDAO;

import basicos.Usuario.Usuario;

public class UsuarioDAO {

	public void inserirUsuario(Usuario u){
		
	}
public  Usuario  pesquisarUsuario(String login){
	 	
	return null;
	}

public boolean efetuarLogin(String log, String senha){
	
	if (senha.equals (log)) {
		return true;
	} else {
		return false ;
	}
	
}
	
}
