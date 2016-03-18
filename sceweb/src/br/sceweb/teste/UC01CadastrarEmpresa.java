package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import br.sceweb.modelo.*;

public class UC01CadastrarEmpresa {

	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		
		empresa.setCnpj("04908850000143");
		empresa.setNomeDaEmpresa("Lasertech Sistemas Ltda. ME");
		empresa.setNomeFantasia("Lasertech Sistemas");
		empresa.setEndereco("Manoel Goulart, 1856, sala 03");
		empresa.setTelefone("1832220656");
	}
	
	@Test
	public void CT01UC01FBCadastro_com_sucesso(){
		//assertEquals(1,empresaDAO.adiciona(empresa));
		assertEquals(1,empresaDAO.exclui("04908850000143"));
	}
	public void test() {
		fail("Not yet implemented");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}


//anotações, o mysql, ao fazer a inserção, devolve 1, caso de algum erro, retorna 0