import java.time.LocalDateTime;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
public class IngressoTest {
    
Regular regular;
@BeforeEach 
public void setup() {
    Regular regular = new Regular
    ("Shihiro", LocalDateTime.now());
    regular.incluir(EAdicional.REFRIGERANTE);
}
@Test
public void criarIngressoRegular() {
    double total = regular.valorIngresso();
}

}
