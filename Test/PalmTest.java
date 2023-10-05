import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalmTest {

    Plants p = new Palm("Palma", 5);

    @Test
    void howToWaterPlant() {
        p.setAmountOfLiquid(p.calculateAmountOfWater(p));
        double expectedValue = 2.5;
        double actualValue = p.getAmountOfLiquid();
        Assertions.assertEquals(expectedValue, actualValue);
    }
}