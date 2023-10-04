import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousTest {

    Plants p = new Carnivorous("Carni", 0.7);

    @Test
    void howToWaterPlant() {
        p.setAmountOfLiquid(p.howToWaterPlant(p));
        double expectedValue = 0.24;
        double actualValue = p.getAmountOfLiquid();
        Assertions.assertEquals(expectedValue, actualValue);
    }
}