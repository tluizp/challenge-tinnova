package model;

public class VotosComputados {

    private Integer totalEleitores;
    private Integer votosValidos;
    private Integer votosBrancos;
    private Integer votosNulos;

    public Integer getTotalEleitores() {
        return totalEleitores;
    }

    public void setTotalEleitores(Integer totalEleitores) {
        this.totalEleitores = totalEleitores;
    }

    public Integer getVotosValidos() {
        return votosValidos;
    }

    public void setVotosValidos(Integer votosValidos) {
        this.votosValidos = votosValidos;
    }

    public Integer getVotosBrancos() {
        return votosBrancos;
    }

    public void setVotosBrancos(Integer votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    public Integer getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(Integer votosNulos) {
        this.votosNulos = votosNulos;
    }

    public double percentualVotosValidosEmRelacaoTotalEleitores() {
        return (double) this.getVotosValidos() / this.getTotalEleitores() * 100;
    }

    public double percentualVotosBrancosEmRelacaoTotalEleitores() {
        return (double) this.getVotosBrancos() / this.getTotalEleitores()  * 100;
    }

    public double percentualVotosNulosEmRelacaoTotalEleitores() {
        return (double) this.getVotosNulos() / this.getTotalEleitores() * 100;
    }
}
