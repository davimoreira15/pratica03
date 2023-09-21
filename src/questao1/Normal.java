package questao1;

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimirValor() {
        System.out.println("Ingresso Normal - Valor: R$" + getValor());
    }
}