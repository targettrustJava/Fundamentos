package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import banco.PostgreSql;
import model.Cliente;
import model.ClienteDao;

public class JDBCClienteDao implements ClienteDao {
	private final String tabela = "cliente";

	public void excluir(Cliente cli) {
		if (cli != null) {
			try {
				// criação da instrução SQL
				PreparedStatement stmt = PostgreSql.getConnection()
						.prepareStatement(
								"DELETE FROM " + tabela + " WHERE id= ?");
				// informando o valor do parâmetro id
				stmt.setLong(1, cli.getId());
				// executando instrução no BD
				stmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void gravar(Cliente cli) {
		if (cli != null) {
			try {
				// testa se o cliente ainda não foi cadastrado.
				if (cli.getId() == 0) {
					/*
					 * chama o método getNovoId() para obter o próximo id do BD.
					 */
					cli.setId(getNovoId());
					// criação da instrução SQL
					PreparedStatement stmt = PostgreSql
							.getConnection()
							.prepareStatement(
									"INSERT INTO "
											+ tabela
											+ " (id,nome, cpf) VALUES (?, ?, ?)");
					// informando o valor dos parâmetros
					stmt.setLong(1, cli.getId());
					stmt.setString(2, cli.getNome());
					stmt.setString(3, cli.getCpf());
					stmt.executeUpdate();
				} else { // se cliente já foi cadastrado.
					PreparedStatement stmt = PostgreSql
							.getConnection()
							.prepareStatement(
									"UPDATE "
											+ tabela
											+ " SET nome = ?,cpf = ? WHERE id = ?");
					stmt.setString(1, cli.getNome());
					stmt.setString(2, cli.getCpf());
					stmt.setLong(3, cli.getId());
					stmt.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Método que pesquisa o último id utilizado na tabela cliente e retorna
	 * este id incrementado em 1.
	 */
	private Long getNovoId() throws SQLException {
		java.sql.Statement stmt = PostgreSql.getConnection().createStatement();
		ResultSet rs = ((java.sql.Statement) stmt)
				.executeQuery("SELECT MAX(id) FROM " + tabela);
		if (rs.next())
			return rs.getLong(1) + 1;
		return new Long(1);
	}

	public Cliente consultar(Long id) {
		if (id == null || id == 0)
			return null;
		try {
			PreparedStatement stmt = PostgreSql.getConnection()
					.prepareStatement(
							"SELECT * FROM " + tabela + " WHERE id = ?");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next())
				return new Cliente(rs.getLong("id"), rs.getString("nome"),
						rs.getString("cpf"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Cliente> listar() {
		List<Cliente> lista = new ArrayList<Cliente>();
		try {
			PreparedStatement stmt = PostgreSql.getConnection()
					.prepareStatement(
							"SELECT * FROM " + tabela + " ORDER	BY nome");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				lista.add(new Cliente(rs.getLong("id"), rs.getString("nome"),
						rs.getString("cpf")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
