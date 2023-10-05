import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CactusTest {

    Plants p = new Cactus("Cacci", 0.2);

    @Test
    void howToWaterPlant() {
        p.setAmountOfLiquid(p.calculateAmountOfWater(p));
        double expectedValue = 0.02;
        double actualValue = p.getAmountOfLiquid();
        Assertions.assertEquals(expectedValue, actualValue);
    }

}