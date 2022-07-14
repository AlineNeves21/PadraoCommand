public class AberturaQuarterTarefa implements Tarefa {

    private Quarter quarter;

    public AberturaQuarterTarefa(Quarter quarter) {
        this.quarter = quarter;
    }

    public void executar() {
        this.quarter.abrirQuarter();
    }

    public void cancelar() {
        this.quarter.fecharQuarter();
    }
}
