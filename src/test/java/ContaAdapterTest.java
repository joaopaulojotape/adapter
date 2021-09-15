import org.junit.Test;
import static org.junit.Assert.*;

class ContaAdapterTest {

    @Test
    void testarConataBasica()  {
        ContaBasica basica1 = new ContaBasica();
        ContaAdapter contab = new ContaAdapter(basica1);
        assertEquals("Conta Basica",contab.solicitarBasico());
    }

    @Test
    void testarConataGratuita()  {
        ContaGratuita gt = new ContaGratuita();
        ContaAdapter contag = new ContaAdapter(gt);
        assertEquals("Conta Gratuita",contag.solicitarGratuito());
    }

    @Test
    void testarConataUtimate()  {
        ContaUltimate ut = new ContaUltimate();
        ContaAdapter contau = new ContaAdapter(ut);
        assertEquals("Conta ULtimate",contau.solicitarUtimate());

    }
}