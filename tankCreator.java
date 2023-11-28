import java.util.Scanner;

public class tankCreator {

    public enum TankType {
        LIGHT("Light Tank"), MEDIUM("Medium Tank"), HEAVY("Heavy Tank");

        private final String type;
        TankType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return type;
        }
    }

    public enum ArmorType {
        EXPLOSIVE_REACTIVE("Explosive Reactive Armor"),
        NON_EXPLOSIVE_REACTIVE("Non-Explosive Reactive Armor"),
        COMPOSITE("Composite Armor"),
        STEEL("Steel Armor");
    
        private final String displayName;
    
        ArmorType(String displayName) {
            this.displayName = displayName;
        }
    
        @Override
        public String toString() {
            return displayName;
        }
    }
    
    public enum ShellType {
        ARMOR_PIERCING("Armor Piercing"),
        HIGH_EXPLOSIVE("High Explosive"),
        HEAT("High-Explosive Anti-Tank"),
        SABOT("Armour-Piercing Fin-Stabilized Discarding Sabot");
    
        private final String displayName;
    
        ShellType(String displayName) {
            this.displayName = displayName;
        }
    
        @Override
        public String toString() {
            return displayName;
        }
    }



    private int speed, turningSpeed, shellVelocity, armorThickness;
    private String shell;
    private String tankName;
    private TankType tankType;
    private ArmorType armorType;
    private ShellType shellType;

    public tankCreator() {
        speed = 16; // mph
        turningSpeed = 20; // Degrees per second
        shellVelocity = 140; //meters per second
        armorThickness = 20; // millimeters
        shell = "100mm"; 
        tankType = TankType.LIGHT;
        tankName = "Base Tank";
        armorType = ArmorType.EXPLOSIVE_REACTIVE;
        shellType = ShellType.ARMOR_PIERCING; //AP or HE(High Explosive)
    }

    public tankCreator(int spd, int tspd, int bullvelo, int armrthcknss, String bull, TankType tnktype, String tnkname, ArmorType armrtype, ShellType bullType) {
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
        return tankType.toString();
    }

    public String getTankName() {
        return tankName;
    }

    public String getArmorType() {
        return armorType.toString();
    }

    public String getshellType() {
        return shellType.toString();
    }

    public void tankDecider() {

    }

    public void tankPrintDefaultValues() {
        System.out.println("Tank Main Values");
        System.out.println("----------------------------------------");
        System.out.println();
    }
}
