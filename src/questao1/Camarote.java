package questao1;

class Camarote extends Ingresso {
    private double adicional;
    private String localizacao;

    public Camarote(double valor, double adicional, String localizacao) {
        super(valor);
        this.adicional = adicional;
        this.localizacao = localizacao;
    }

    public void imprimirValor() {
        double valorTotal = getValor() + adicional;
        System.out.println("Ingresso Camarote - Localização: " + localizacao + " - Valor: R$" + valorTotal);
    }
}