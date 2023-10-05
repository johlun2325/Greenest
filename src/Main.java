import javax.swing.*;
import java.util.ArrayList;

public class Main {

    Plants laura = new Palm("Laura", 5);
    Plants olof = new Palm("Olof", 1);
    Plants igge = new Cactus("Igge", 0.2);
    Plants meatloaf = new Carnivorous("Meatloaf", 0.7);
    ArrayList<Plants> listOfPlants = new ArrayList<>();

    Main() {
        laura.setAmountOfLiquid(laura.calculateAmountOfWater(laura));
        olof.setAmountOfLiquid(olof.calculateAmountOfWater(olof));
        meatloaf.setAmountOfLiquid(meatloaf.calculateAmountOfWater(meatloaf));
        listOfPlants.add(laura);
        listOfPlants.add(olof);
        listOfPlants.add(igge);
        listOfPlants.add(meatloaf);
    }


    public static void main(String[] args) {
        Main m = new Main();

        boolean isFound = false;
        String askWhatPlantMsg = "Vilken växt ska få mat?";
        String plantNotFoundMsg = "Växten finns inte hos oss.";

        String inputName = JOptionPane.showInputDialog(askWhatPlantMsg);

        for (Plants plant : m.listOfPlants) {
            if (plant.getName().equalsIgnoreCase(inputName)) {

                String waterInstruction =
                        plant.printWaterInstruction(plant.getAmountOfLiquid(), plant.getTypeOfLiquid(), plant);
                JOptionPane.showMessageDialog(null, waterInstruction);

                isFound = true;
                break;
            }
        }
        if (!isFound)
            JOptionPane.showMessageDialog(null, plantNotFoundMsg);
    }
}