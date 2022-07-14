public class FechamentoQuarterTarefa implements Tarefa {

    private Quarter quarter;

    public FechamentoQuarterTarefa(Quarter quarter) {
        this.quarter = quarter;
    }

    public void executar() {
        this.quarter.fecharQuarter();
    }

    public void cancelar() {
        this.quarter.abrirQuarter();
    }
}
