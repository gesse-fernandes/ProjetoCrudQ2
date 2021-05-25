package Controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Dao.ProdutosDao;
import Model.ProdutosModel;

public class ProdutosController {
    ProdutosDao produtoDao;

    public ProdutosController() {
        produtoDao = new ProdutosDao();
    }

    public boolean cadastrar(ProdutosModel produto) {
        boolean x = true;
        if (produto.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Nome", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else if (produto.getNome().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome não pode Ser Nulo", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else if (produtoDao.existeProduto(produto)) {
            JOptionPane.showMessageDialog(null, "Já existe  Esse produto cadastre outro", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else if (produto.getDataValidade().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Data", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\projetoCrudProdutoQ1\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else if (produto.getQtd() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Quantidade", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\projetoCrudProdutoQ1\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else if (produto.getValorUnitario() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Valor Unitario", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\projetoCrudProdutoQ1\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else {
            x = true;
        }
        if (x == true) {
            produtoDao.inserir(produto);
            return x;
        }
        return x;

    }

    public String proximoProduto() {
        return produtoDao.ProximoProduto();
    }

    public void pesquisar(String pesquisa, DefaultTableModel modelo) {
        produtoDao.buscarProduto(pesquisa, modelo);
    }

    public ProdutosModel preenche(int id) {
        return produtoDao.preenche(id);
    }

    public boolean editar(ProdutosModel produtosModel) {
        boolean x = true;
        if (produtosModel.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Nome", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else if (produtosModel.getNome().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome não pode Ser Nulo", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else if (produtosModel.getDataValidade().equals("##/##/####")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Data", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\projetoCrudProdutoQ1\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else if (produtosModel.getQtd() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Quantidade", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\projetoCrudProdutoQ1\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else if (produtosModel.getValorUnitario() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Valor Unitario", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\projetoCrudProdutoQ1\\src\\Imagens\\btn_sair.png"));
            x = false;
        } else {
            x = true;
        }
        if (x == true) {
            produtoDao.editar(produtosModel);
            return x;
        }
        return x;
    }

    public void deletar(ProdutosModel prod) {
        produtoDao.deletar(prod);
    }
}
