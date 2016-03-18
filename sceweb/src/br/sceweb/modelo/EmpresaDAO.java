package br.sceweb.modelo;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.sceweb.servico.FabricaDeConexoes;

public class EmpresaDAO {
	Logger logger = Logger.getLogger(EmpresaDAO.class);
	PreparedStatement ps;
	int codigoRetorno;
	public int adiciona(Empresa empresa)
	{
		try(Connection conn = new FabricaDeConexoes().getConnection()){
			logger.info("Conectou");
			ps = (PreparedStatement) conn.prepareStatement("insert into empresa (cnpj, nomeDaEmpresa,nomeFantasia, endereco, telefone) values(?,?,?,?,?)");
			ps.setString(1, empresa.getCnpj());
			ps.setString(2, empresa.getNomeDaEmpresa());
			ps.setString(3, empresa.getNomeFantasia());
			ps.setString(4, empresa.getEndereco());
			ps.setString(5, empresa.getTelefone());
			codigoRetorno = ps.executeUpdate();
			ps.close();
			logger.info("Gravou");
		}
		catch(SQLException e)
		{
			logger.info("Erro na Inserção: " + e.getMessage());
			throw new RuntimeException(e);
		}
		logger.info("Chamou o método adiciona");
		return 1;
	}
	public int exclui(String cpnj)
	{
		try(Connection conn = new FabricaDeConexoes().getConnection()){
			logger.info("Conectou");
			ps = (PreparedStatement) conn.prepareStatement("delete from empresa where cnpj = ?");
			ps.setString(1, cpnj);			
			codigoRetorno = ps.executeUpdate();
			ps.close();
			logger.info("Excluiu");
		}
		catch(SQLException e)
		{
			logger.info("Erro na Exclusão: " + e.getMessage());
			throw new RuntimeException(e);
		}		
		return 1;
		
	}

}
