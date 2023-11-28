import java.util.Scanner;

public class tankCreator {

    private int speed, turningSpeed, shellVelocity, armorThickness;
    private String shell, tankType, tankName, armorType, shellType;

    public tankCreator() {
        speed = 16; // mph
        turningSpeed = 20; // Degrees per second
        shellVelocity = 140; //meters per second
        armorThickness = 20; // millimeters
        shell = "100mm"; 
        tankType = "Light Tank";
        tankName = "Base Tank";
        armorType = "Non-Explosive Reactive Armor";
        shellType = "Armor Piercing"; //AP or HE(High Explosive)
    }

    public tankCreator(int spd, int tspd, int bullvelo, int armrthcknss, String bull, String tnktype, String tnkname, String armrtype, String bullType) {
        speed = spd;
        turningSpeed = tspd;
        shellVelocity = bullvelo;
        armorThickness = armrthcknss;
        shell = bull;
        tankType = tnktype;
        tankName = tnkname;
        armorType = armrtype;
        shellType = bullType;
    }

    public int getTankSpeed() {
        return speed;
    }

    public int getTankTurningSpeed() {
        return turningSpeed;
    }

    public int getshellVelocity() {
        return shellVelocity;
    }

    public int getArmorThickness() {
        return armorThickness;
    }

    public String getshell() {
        return shell;
    }

    public String getTankType() {
        return tankType;
    }

    public String getTankName() {
        return tankName;
    }

    public String getArmorType() {
        return armorType;
    }

    public String getshellType() {
        return shellType;
    }
}
