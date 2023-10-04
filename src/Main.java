import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    Plants laura = new Palm("Laura", 5);
    Plants olof = new Palm("Olof", 1);
    Plants igge = new Cactus("Igge", 0.2, 0.2);
    Plants meatloaf = new Carnivorous("Meatloaf", 0.7);
    ArrayList<Plants> listOfPlants = new ArrayList<>();

    Main() {
        laura.setAmountOfLiquid(laura.howToWaterPlant(laura));
        olof.setAmountOfLiquid(olof.howToWaterPlant(olof));
        meatloaf.setAmountOfLiquid(meatloaf.howToWaterPlant(meatloaf));
        listOfPlants.add(laura);
        listOfPlants.add(olof);
        listOfPlants.add(igge);
        listOfPlants.add(meatloaf);
    }


    public static void main(String[] args) {
        Main m = new Main();

        String inputName = JOptionPane.showInputDialog("Vilken växt ska få mat?");

        boolean isFound = false;

        for (Plants plant : m.listOfPlants) {
            if (plant.getName().equalsIgnoreCase(inputName)) {

                String message = plant.printWaterInstruction(plant.getAmountOfLiquid(), plant.getTypeOfLiquid(), plant);
                JOptionPane.showMessageDialog(null, message);

                isFound = true;
                break;
            }
        }
        if (!isFound)
            JOptionPane.showMessageDialog(null, "Växten finns inte hos oss.");

    }
}