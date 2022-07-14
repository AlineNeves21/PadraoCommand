public class Quarter {

    private int ano;
    private int quarter;
    private String situacao;

    public Quarter(int ano, int quarter) {
        this.ano = ano;
        this.quarter = quarter;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirQuarter() {
        this.situacao = "Quarter aberto";
    }

    public void fecharQuarter() {
        this.situacao = "Quarter fechado";
    }
}
