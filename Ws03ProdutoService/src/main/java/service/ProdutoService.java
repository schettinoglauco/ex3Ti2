package service;

import spark.Request;
import spark.Response;
import dao.ProdutoDAO;
import model.Produto;

public class ProdutoService {

private ProdutoDAO produtoDAO = new ProdutoDAO();

public Object insert(Request request, Response response) {
String nome = request.queryParams("nome");
double preco = Double.parseDouble(request.queryParams("preco"));

Produto produto = new Produto(nome, preco);
produtoDAO.insert(produto);

response.redirect("/formulario.html");
return null;
}

public Object get(Request request, Response response) {
return "GET funcionando";
}

public Object getAll(Request request, Response response) {
return "LIST funcionando";
}

public Object getToUpdate(Request request, Response response) {
return "UPDATE GET funcionando";
}

public Object update(Request request, Response response) {
return "UPDATE POST funcionando";
}

public Object delete(Request request, Response response) {
return "DELETE funcionando";
}
}
