package testaproduto;
public class Produto {
    private String marca;
    private String fabricante;
    private String cod_barras;
    private float preco;

    public Produto() {
    }

    public Produto(String m, String f, String c, float p) {
        this.marca = m;
        this.fabricante = f;
        this.cod_barras = c;
        this.preco = p;
    }

    public String obterMarca() { 
        return marca; 
    }
    
    public void definirMarca(String marca) { 
        this.marca = marca; 
    }

    public String obterFabricante() { 
        return fabricante; 
    }
    
    public void definirFabricante(String fabricante) { 
        this.fabricante = fabricante; 
    }

    public String obterCodBarras() { 
        return cod_barras; 
    }
    
    public void definirCodBarras(String cod_barras) { 
        this.cod_barras = cod_barras; 
    }

    public float obterPreco() { 
        return preco; 
    }
    
    public void definirPreco(float preco) { 
        this.preco = preco; 
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca + " | Fabricante: " + fabricante + 
                           " | Cod. Barras: " + cod_barras + " | Preco: R$ " + preco);
    }
}