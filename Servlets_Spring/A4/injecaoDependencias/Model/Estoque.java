package M1S5.injecaoDependencias.Model;

public class Estoque {
    
    public String getLocalEstoque(String idProduto){

        if(idProduto.equals("A")){
            return "Não Encontado!";
        }
        return "Produto está no Setor L3";
    }

}
