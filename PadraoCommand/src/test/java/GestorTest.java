import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorTest{

    Gestor gestor;
    Quarter quarter;

    @BeforeEach
    void setUp() {
        gestor = new Gestor();
        quarter = new Quarter (2022, 3);
    }

    @Test
    void deveAbrirQuarter() {
        Tarefa aberturaQuarter = new AberturaQuarterTarefa(quarter);
        gestor.executarTarefa(aberturaQuarter);

        assertEquals("Quarter aberto", quarter.getSituacao());
    }

    @Test
    void deveFecharQuarter() {
        Tarefa fechamentoQuarter = new FechamentoQuarterTarefa(quarter);
        gestor.executarTarefa(fechamentoQuarter);

        assertEquals("Quarter fechado", quarter.getSituacao());
    }

    @Test
    void deveCancelarFechamentoQuarter() {
        Tarefa aberturaQuarter = new AberturaQuarterTarefa(quarter);
        Tarefa fechamentoQuarter = new FechamentoQuarterTarefa(quarter);

        gestor.executarTarefa(aberturaQuarter);
        gestor.executarTarefa(fechamentoQuarter);

        gestor.cancelarUltimaTarefa();

        assertEquals("Quarter aberto", quarter.getSituacao());
    }
}
