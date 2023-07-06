 class moto extends Veiculo {

    private int ano;

    public moto() {
        super();
    }

    public moto(String modelo, double preco,int ano){
        super(modelo, preco);
        this.ano=ano;
    }

     public int getAno() {
         return ano;
     }

     @Override
    public String getTipo() {
        return "Moto";
    }

    @Override
    public void inserirDados() {

    }

    @Override
    public void imprimirRelatorio() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço: R$" + getPreco());

    }

}
