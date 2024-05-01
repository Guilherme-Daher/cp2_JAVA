class ControleVeiculo {
    private Veiculo veiculo;

    public ControleVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public boolean estaLigado() {
        return veiculo.velocidadeAtual > 0;
    }

    public boolean arCondicionadoLigado() {
        return estaLigado();
    }
}

