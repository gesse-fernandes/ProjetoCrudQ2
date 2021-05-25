package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Model.ProdutosModel;
import Util.Conexao;
import Util.Corretores;

public class ProdutosDao {
    
    public ProdutosDao()
    {

    }

    public void inserir(ProdutosModel produtosModel)
    {
        try {
            String INSERT = "INSERT INTO produtos(nome,data_validade,qtd,valorUnitario,valorTotal)VALUES(?,?,?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(INSERT);
            st.setString(1, produtosModel.getNome());
            st.setString(2, Corretores.ConverterParaSQL(produtosModel.getDataValidade()));
            st.setInt(3, produtosModel.getQtd());
            st.setDouble(4, produtosModel.getValorUnitario());
            st.setDouble(5, produtosModel.getValorTotal());
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso", "ok", 1, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\ok.png"));
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, "erro ao cadastrar\n"+e.getMessage(), "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
        }
    }

    public String ProximoProduto() {
        String SELECT = "SELECT * FROM produtos order by id desc limit 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SELECT);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("id")) + 1) + "";
            } else {
                return "1";
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "erro ao buscar com o registro", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
            return "0";
        }
    }
    
    public boolean existeProduto(ProdutosModel produto) {
        boolean status = false;
        try {
            String SELECT = "SELECT nome FROM produtos where nome = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SELECT);
            st.setString(1, produto.getNome());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                status = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "erro ao buscar Email do usuario", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
        }
        return status;
    }
    
    public void buscarProduto(String pesquisa, DefaultTableModel modelo) {
        try {
            String SELECT = "SELECT * from produtos where nome like '%" + pesquisa + "%'";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SELECT);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[] { rs.getInt("id"), rs.getString("nome"), rs.getString("data_validade"),
                        rs.getInt("qtd"), rs.getDouble("valorUnitario"), rs.getDouble("valorTotal") });
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "erro ao buscar Produto\n" + e.getMessage(), "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
        }

    }

    public ProdutosModel preenche(int id) {
        ProdutosModel produto = new ProdutosModel();
        try {
            String SELECT = "SELECT * FROM produtos where id = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SELECT);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setDataValidade(Corretores.ConverterParaJava(rs.getString("data_validade")));
                produto.setQtd(rs.getInt("qtd"));
                produto.setValorUnitario(rs.getDouble("valorUnitario"));
                produto.setValorTotal(rs.getDouble("valorTotal"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "erro ao buscar produto", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
        }
        return produto;
    }

    public void editar(ProdutosModel prod) {
        try {
            String UPDATE = "UPDATE produtos set nome=?,data_validade=?,qtd=?,valorUnitario=?,valorTotal=? where id = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(UPDATE);
            st.setString(1, prod.getNome());
            st.setString(2,Corretores.ConverterParaSQL(prod.getDataValidade()));
            st.setInt(3, prod.getQtd());
            st.setDouble(4, prod.getValorUnitario());
            st.setDouble(5, prod.getValorTotal());
            st.setInt(6, prod.getId());
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Editado com sucesso", "Sucesso", 1, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\ok.png"));
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Erro ao Editar no banco de dados", "Erro", 0, new ImageIcon(
                    "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
        }
    }

    public void deletar(ProdutosModel produto) {
        int delete = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir?");
        if (delete == JOptionPane.YES_OPTION) {
            String DELETE = "DELETE FROM produtos where id  = ?";
            try {
                PreparedStatement st = Conexao.getConnection().prepareStatement(DELETE);
                st.setInt(1, produto.getId());
                st.executeUpdate();
                Conexao.getConnection().commit();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso", "Sucesso", 1, new ImageIcon(
                        "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\ok.png"));
            } catch (Exception e) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, "Erro ao Editar no banco de dados" + e.getMessage(), "Erro", 0,
                        new ImageIcon(
                                "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));
            }
        }
    }
}
