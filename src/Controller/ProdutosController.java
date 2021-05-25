package Controller;

import javax.swing.table.DefaultTableModel;

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

    public void pesquisar(String pesquisa, DefaultTableModel modelo)
    {
        produtoDao.buscarProduto(pesquisa, modelo);
    }

    public ProdutosModel preenche(int id)
    {
        return produtoDao.preenche(id);
    }

    public void editar(ProdutosModel produtosModel)
    {
        produtoDao.editar(produtosModel);
    }

    public void deletar(ProdutosModel prod)
    {
        produtoDao.deletar(prod);
    }
}
