package Controller;

import Dao.ProdutosDao;
import Model.ProdutosModel;

public class ProdutosController {
    ProdutosDao produtoDao;

    public ProdutosController()
    {
        produtoDao = new ProdutosDao();
    }

    public void cadastrar(ProdutosModel produto)
    {
        produtoDao.inserir(produto);
    }
    public String proximoProduto()
    {
        return produtoDao.ProximoProduto();
    }
}
