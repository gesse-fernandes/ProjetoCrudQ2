package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
}
