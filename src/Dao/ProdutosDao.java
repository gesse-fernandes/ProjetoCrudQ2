package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Util.Conexao;

public class ProdutosDao {
    
    public ProdutosDao()
    {

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
