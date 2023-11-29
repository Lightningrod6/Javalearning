import java.util.Scanner;

public class tankOne {
    public static void main(String[] args) throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        tankCreator javelin = new tankCreator();
        tankCreator.TankType decision = javelin.tankDecider();
        if (decision == tankCreator.TankType.LIGHT) {
            System.out.println("Selected tank type: Light");
            Thread.sleep(2000);
            System.out.println("Generating Appropriate Values...");
            Thread.sleep(5000);
            System.out.println("Generated Values!");
            Thread.sleep(1000);
            System.out.println("Its time to edit the properties of the tank");
            System.out.print("Enter the max speed you want for the tank: ");
            int speedoption = keyboard.nextInt();
            if (speedoption > 36) {
                System.out.println("Cannot go above 36mph. Please enter a new speed:");
                speedoption = keyboard.nextInt();
            }
            javelin.setTankSpeed(speedoption);
            System.out.println("Great! The tank speed has been set to " + javelin.getTankSpeed());
            Thread.sleep(1000);
            System.out.println("Now its time to set the turning speed of the tank");
            int turningSpeedOption = keyboard.nextInt();
            if (turningSpeedOption > 30) {
                System.out.println("Cannot go above 30a/s(Angle per second). Please enter a new speed:");
                turningSpeedOption = keyboard.nextInt();
            }
            javelin.setTurningSpeed(turningSpeedOption);
            System.out.println("The turning speed has now been set to " + javelin.getTankTurningSpeed());
            Thread.sleep(1000);
            System.out.println("Now its time to choose what Caliber you will use, High calibers mean more damage but more drop off if your shooting from far away");
            tankCreator.Caliber decision2 = javelin.caliberDecider();
            if (decision2 == tankCreator.Caliber.SEVENTY_SIX_MM) {
                System.out.println("Selected Caliber: 76mm\n");
                Thread.sleep(2000);
            } else if(decision2 == tankCreator.Caliber.NINETY_MM) {
                System.out.println("Selected Caliber: 90mm\n");
                Thread.sleep(2000);
            } else if(decision2 == tankCreator.Caliber.ONE_HUNDRED_MM) {
                System.out.println("Selected Caliber: 100mm\n");
                Thread.sleep(2000);
            } else if(decision2 == tankCreator.Caliber.ONE_HUNDRED_FIVE_MM) {
                System.out.println("Selected Caliber: 105mm\n");
                Thread.sleep(2000);
            } else if(decision2 == tankCreator.Caliber.ONE_HUNDRED_TWENTY_MM) {
                System.out.println("Selected Caliber: 120mm\n");
                Thread.sleep(2000);
            }
            javelin.setCaliber(decision2);
            System.out.println("Now its time to choose the armor type. These can vary in how strong your tank is but it can either increase or decrease the tank's max speed");
            tankCreator.ArmorType decision3 = javelin.armorTypeDecider();
            if (decision3 == tankCreator.ArmorType.EXPLOSIVE_REACTIVE) {
                System.out.println("Selected Armor Type: Explosive Reactive\n");
                speedoption -= 4;
                Thread.sleep(2000);
            } else if (decision3 == tankCreator.ArmorType.NON_EXPLOSIVE_REACTIVE) {
                System.out.println("Selected Armor Type: Non Explosive Reactive");
                speedoption -= 2;
                Thread.sleep(2000);
            } else if (decision3 == tankCreator.ArmorType.COMPOSITE) {
                System.out.println("Selected Armor Type: Composite");
                Thread.sleep(2000);
            } else if(decision3 == tankCreator.ArmorType.STEEL) {
                System.out.println("Selected Armor Type: Steel");
                speedoption -= 10;
                Thread.sleep(2000);
            }
            
            javelin.setArmorType(decision3);

            System.out.println("Now its time to create your armor thickness. With the addition of your armor. For every 25mm you add your speed will decrease by atleast 1 so be cautios as your speed is set at " + javelin.getTankSpeed()1);
        } else if (decision == tankCreator.TankType.MEDIUM) {
            System.out.println("Selected Tank Type: Medium");
        } else if (decision == tankCreator.TankType.HEAVY) {
            System.out.println("Selected Tank Type: Heavy");
        }
    }
}