package eigeneTests;

import de.bht.pr2.lession02.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class derTest {


    @Test
    void a() {

        assertAllll testobjekt1 = new assertAllll (false,4);
        assertAllll testobjekt2 = new assertAllll (false,88);


        Car auto = new Car("Audi", "gelb", "Berlin", 10000);
        auto.drive("Hamburg", 300);

        assertAll("Alle Zeilen werden ausgefuehrt",
                () -> assertEquals("Hamburg", auto.getPosition()),
                () -> assertEquals(9999, auto.getKmStatus()),
                () -> assertEquals(testobjekt1, testobjekt2),
                () -> assertTrue(testobjekt1.zustand),
                () -> assertTrue(testobjekt2.zustand),
                () -> assertFalse(testobjekt2.zustand)



        );
    }
}
