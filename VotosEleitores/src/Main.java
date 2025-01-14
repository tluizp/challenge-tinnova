import model.VotosComputados;

public class Main {
    public static void main(String[] args) {
        System.out.println("Votos em relação ao total de eleitores");
        VotosComputados votosComputados = new VotosComputados();
        votosComputados.setTotalEleitores(1000);
        votosComputados.setVotosValidos(800);
        votosComputados.setVotosBrancos(150);
        votosComputados.setVotosNulos(50);

        double validos = votosComputados.percentualVotosValidosEmRelacaoTotalEleitores();
        System.out.printf("Porcentagem votos validos: %.2f%%%n", validos);

        double brancos = votosComputados.percentualVotosBrancosEmRelacaoTotalEleitores();
        System.out.printf("Porcentagem votos brancos: %.2f%%%n", brancos);

        double nulos = votosComputados.percentualVotosNulosEmRelacaoTotalEleitores();
        System.out.printf("Porcentagem votos nulos: %.2f%%%n", nulos);
    }
}