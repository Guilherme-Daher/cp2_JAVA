class ControleCarro {
    private Carro carro;

    public ControleCarro(Carro carro) {
        this.carro = carro;
    }

    public boolean estaLigado() {
        return carro.getVelocidadeAtual() > 0;
    }

    public boolean arCondicionadoLigado() {
        return estaLigado(); // Ar condicionado ligado se o carro estiver ligado
    }

    public void imprimirEstadoCarro() {
        if (estaLigado()) {
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro está desligado.");
        }
    }
}
