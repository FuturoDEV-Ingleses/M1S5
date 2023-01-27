package M1S5.injecaoDependencias.Model;

public class Produto {
    private final Estoque estoque;
    public String idProduto;

    public Produto(Estoque _estoque){
        this.estoque = _estoque;
    }

    public String verificaLocalEstoque(){
        return estoque.getLocalEstoque(this.idProduto);
    }

}
