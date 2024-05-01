public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "T-cross", 2024, 200);
        Moto moto = new Moto("Suzuki", "GSX-R", 2022, 120);
        Caminhao caminhao = new Caminhao("Mercedes-Benz", "Actros", 2018, 100, 1.0);

        System.out.println("Carro:");
        carro.acelerar(0);
        carro.obterStatus();
        carro.getControle().imprimirEstadoCarro(); // Imprime se o carro está ligado ou desligado
        carro.ligarArCondicionado();

        System.out.println("\nMoto:");
        moto.acelerar(70);
        moto.obterStatus();
        moto.empinar();

        System.out.println("\nCaminhão:");
        caminhao.acelerar(50);
        caminhao.obterStatus();
        caminhao.transportarCarga(0.8);
    }
}