abstract class Veiculo {

    private String modelo;
    private double preco;

    public Veiculo() {
    }

  public Veiculo(String modelo, Double preco){
        setpreco(preco);
        this.modelo=modelo;
  }

    void setpreco(Double preco) {
    }

    public double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public abstract String getTipo();

    public abstract void inserirDados();

    public abstract void imprimirRelatorio();
}
