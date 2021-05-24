package Controller;

import Dao.ProdutosDao;

public class ProdutosController {
    ProdutosDao produtoDao;

    public ProdutosController()
    {
        produtoDao = new ProdutosDao();
    }

    public String proximoProduto()
    {
        return produtoDao.ProximoProduto();
    }
}
