public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected int velocidadeMaxima;
    protected int velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int incremento) {
        if (velocidadeAtual + incremento <= velocidadeMaxima) {
            velocidadeAtual += incremento;
        } else {
            System.out.println("Velocidade máxima excedida!");
        }
    }

    public void reduzirVelocidade(int decremento) {
        if (velocidadeAtual - decremento >= 0) {
            velocidadeAtual -= decremento;
        } else {
            System.out.println("Veículo já está parado!");
        }
    }

    public void obterStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}