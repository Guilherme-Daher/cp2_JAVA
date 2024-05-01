public class Carro extends Veiculo {
    private ControleCarro controle;
    @SuppressWarnings("unused")
    private boolean arCondicionado;

    public Carro(String marca, String modelo, int ano, int velocidadeMaxima) {
        super(marca, modelo, ano, velocidadeMaxima);
        this.controle = new ControleCarro(this);
        this.arCondicionado = false;
    }

    @Override
    public int getVelocidadeAtual() {
        return super.getVelocidadeAtual();
    }

    public void ligarArCondicionado() {
        if (controle.arCondicionadoLigado()) {
            arCondicionado = true;
            System.out.println("Ar condicionado ligado.");
        } else {
            System.out.println("Não é possível ligar o ar condicionado com o carro desligado!");
        }
    }

    public void desligarArCondicionado() {
        arCondicionado = false;
        System.out.println("Ar condicionado desligado.");
    }

    public ControleCarro getControle() {
        return controle;
    }
}
