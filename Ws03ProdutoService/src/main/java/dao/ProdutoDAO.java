package dao;

import java.sql.*;
import model.Produto;

public class ProdutoDAO {

private Connection conectar() throws Exception {
return DriverManager.getConnection(
"jdbc:postgresql://localhost:5432/produtos_db",
"postgres",
"123456"
);
}

public boolean insert(Produto produto) {
boolean status = false;
try (Connection conn = conectar()) {
String sql = "INSERT INTO produto (nome, preco) VALUES (?, ?)";
PreparedStatement st = conn.prepareStatement(sql);
st.setString(1, produto.getNome());
st.setDouble(2, produto.getPreco());
st.executeUpdate();
System.out.println("Produto inserido: " + produto.getNome());
status = true;
} catch (Exception e) {
e.printStackTrace();
}
return status;
}
}
