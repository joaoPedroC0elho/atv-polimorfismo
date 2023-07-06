 class Carro extends Veiculo{

    private double km;

     public Carro() {
         super();
     }

     public Carro(int ano, String modelo, double preco){
         super(modelo, preco);
        setkm(km);
     }

     private void setkm(double km) {
     }


     public double getKm() {
         return km;
     }

     @Override
     public String getTipo() {
         return "Carro";
     }

     @Override
     public void inserirDados() {

     }

     @Override
     public void imprimirRelatorio() {
         System.out.println("Modelo: " + getModelo());
         System.out.println("Ano: " + getKm());
         System.out.println("Preço: R$" + getPreco());
     }


 }
