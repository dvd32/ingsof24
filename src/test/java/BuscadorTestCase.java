import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.example.insw.Buscador;
import com.example.insw.Calculator;
import java.util.Arrays;
import java.util.List;

class BuscadorTestCase {

    Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }


String [] nombres = {"Rausa","Pietro","Poggi"};

List<String> listaNombres = Arrays.asList(nombres);

@Test
@DisplayName("Simple multiplication should work")
void testBuscarPalabra() {
assertEquals(true, buscador.buscarPalabra("Pietro", listaNombres ),
"Word found");
}

@Test
@DisplayName("Simple multiplication should work")
void testDevolverPalabra() {
assertEquals("Rausa", buscador.devolverPalabra(listaNombres,0 ),
"Word given");
}

@Test
@DisplayName("Simple multiplication should work")
void testDevolverPrimerElemento() {
assertEquals("Rausa", buscador.devolverPrimerElemento(listaNombres ),
"First Word given");
}

@Test
@DisplayName("Simple multiplication should work")
void testDevolverUltimoElemento() {
assertEquals("Poggi", buscador.devolverUltimoElemento(listaNombres ),
"Last Word given");
}

}
