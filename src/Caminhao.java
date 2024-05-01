public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int velocidadeMaxima, double capacidadeCarga) {
        super(marca, modelo, ano, velocidadeMaxima);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void transportarCarga(double carga) {
        if (carga <= capacidadeCarga) {
            System.out.println("Carga transportada com sucesso.");
        } else {
            System.out.println("Capacidade de carga excedida.");
        }
    }
}
