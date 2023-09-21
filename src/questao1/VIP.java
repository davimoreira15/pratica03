package questao1;

class VIP extends Ingresso {
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public void imprimirValor() {
        double valorTotal = getValor() + adicional;
        System.out.println("Ingresso VIP - Valor: R$" + valorTotal);
    }
}