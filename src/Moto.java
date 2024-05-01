public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano, int velocidadeMaxima) {
        super(marca, modelo, ano, velocidadeMaxima);
    }

    public void empinar() {
        if (getVelocidadeAtual() > 20 && getVelocidadeAtual() < 50) {
            System.out.println("Empinando a moto!");
        } else {
            System.out.println("Não é possível empinar a moto nessa velocidade.");
        }
    }
}
