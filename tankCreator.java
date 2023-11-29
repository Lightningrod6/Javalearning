import java.util.Scanner;

public class tankCreator {

    public enum TankType {
        LIGHT("Light"), 
        MEDIUM("Medium"), 
        HEAVY("Heavy");

        private final String displayName2;

        TankType(String displayName2) {
            this.displayName2 = displayName2;
        }
        
        @Override
        public String toString() {
            return displayName2;
        }
    }



    public enum ArmorType {
        EXPLOSIVE_REACTIVE("Explosive Reactive"),
        NON_EXPLOSIVE_REACTIVE("Non-Explosive Reactive"),
        COMPOSITE("Composite"),
        STEEL("Steel");

        private final String displayName3;

        // Constructor to initialize the displayName
        ArmorType(String displayName3) {
            this.displayName3 = displayName3;
        }

        @Override
        public String toString() {
            return displayName3;
        }
    }        
    
    public enum Caliber {
        NINETY_MM("90mm"),
        ONE_HUNDRED_FIVE_MM("105mm"),
        SEVENTY_SIX_MM("76mm"),
        ONE_HUNDRED_MM("100mm"),
        ONE_HUNDRED_TWENTY_MM("120mm");
    
        private final String displayName;
    
        // Constructor to initialize the displayName
        Caliber(String displayName) {
            this.displayName = displayName;
        }
    
        // Override toString method
        @Override
        public String toString() {
            return displayName;
        }
    }

    public enum ShellType {
        ARMOR_PIERCING("Armor Piercing"),
        HIGH_EXPLOSIVE("High Explosive"),
        HEAT("High Explosive Anti-Tank"),
        SABOT("SABOT");

        private final String displayName4;

        ShellType(String displayName4) {
            this.displayName4 = displayName4;
        }

        @Override
        public String toString() {
            return displayName4;
        }
    }


    private int speed, turningSpeed, shellVelocity, armorThickness;
    private Caliber caliber;
    private String tankName;
    private TankType tankType;
    private ArmorType armorType;
    private ShellType shellType;

    public tankCreator() {
        speed = 16; // mph
        turningSpeed = 30; // Degrees per second
        shellVelocity = 140; //meters per second
        armorThickness = 20; // millimeters
        caliber = Caliber.ONE_HUNDRED_MM; 
        tankType = TankType.LIGHT;
        tankName = "Base Tank";
        armorType = ArmorType.EXPLOSIVE_REACTIVE;
        shellType = ShellType.ARMOR_PIERCING; //AP or HE(High Explosive)
    }

    public tankCreator(int spd, int tspd, int bullvelo, int armrthcknss, Caliber bull, TankType tnktype, String tnkname, ArmorType armrtype, ShellType bullType) {
        speed = spd;
        turningSpeed = tspd;
        shellVelocity = bullvelo;
        armorThickness = armrthcknss;
        caliber = bull;
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

    public Caliber getCaliber() {
        return caliber;
    }

    public TankType getTankType() {
        return tankType;
    }

    public String getTankName() {
        return tankName;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public ShellType getshellType() {
        return shellType;
    }

    public TankType tankDecider() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a tank type (1: LIGHT, 2: MEDIUM, 3: HEAVY):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                setTankType(TankType.LIGHT);
                break;
            case 2:
                setTankType(TankType.MEDIUM);
                break;
            case 3:
                setTankType(TankType.HEAVY);
                break;
            default:
                System.out.println("Invalid choice. Defaulting to LIGHT.");
                setTankType(TankType.LIGHT);
        }
        return this.tankType;
    }

    public Caliber caliberDecider() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Choose a Caliber {1: 76mm, 2:90mm, 3: 100mm, 4: 105mm, 5. 120mm }");
        int choice = scanner2.nextInt();

        switch (choice) {
            case 1:
                setCaliber(Caliber.SEVENTY_SIX_MM);
            break;
            case 2:
                setCaliber(Caliber.NINETY_MM);
            break;
            case 3:
                setCaliber(Caliber.ONE_HUNDRED_MM);
            break;
            case 4:
                setCaliber(Caliber.ONE_HUNDRED_FIVE_MM);
            break;
            case 5: 
                setCaliber(Caliber.ONE_HUNDRED_TWENTY_MM);
            break;
                default:
                System.out.println("Invalid choice. Defaulting to 76mm.");
                setCaliber(Caliber.SEVENTY_SIX_MM);         
        }

        return this.caliber;
    }

    public ArmorType armorTypeDecider() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Choose an armor type {1: Explosive Reactive (-4 max speed) 2: Non-Explosive Reactive (-2 max speed) 3: Composite (-8 Max speed) 4: Steel (-10)}");
        int choice = scanner3.nextInt();

        switch (choice) {
            case 1:
                setArmorType(ArmorType.EXPLOSIVE_REACTIVE);
            break;
            case 2:
                setArmorType(ArmorType.NON_EXPLOSIVE_REACTIVE);
            break;
            case 3:
                setArmorType(ArmorType.COMPOSITE);
            break;
            case 4:
                setArmorType(ArmorType.STEEL);
            break;
            default:
                System.out.println("Invalid Choice, Defaulting to Non-Explosive Reactive");
                setArmorType(ArmorType.NON_EXPLOSIVE_REACTIVE);
        }

        return this.armorType;
    }        
    public void tankPrintDefaultValues() {
        System.out.println("Tank Details");
        System.out.println("----------------------------------------");
        System.out.println("Tank Name: " + tankName);
        System.out.println("Tank Type: " + tankType);
        System.out.println("Tank Max Speed: " + speed + "mph");
        System.out.println("Tank Turning Speed: " + turningSpeed + "aps(angle per second)");
        System.out.println("Tank Armor: " + armorType);
        System.out.println("Tank Armor Thickness: " + armorThickness + "mm");
        System.out.println("Tank Shell Ammo: " + caliber);
        System.out.println("Shell Velocity: " + shellVelocity + "");
        System.out.println("Shell Type: " + shellType);
    }

	public void setTankType(TankType newTankType) {
        this.tankType = newTankType;
	}

    public void setCaliber(Caliber newCaliber) {
        this.caliber = newCaliber;
    }

    public void setTankSpeed(int newspeed) {
        this.speed = newspeed;
    }
    public void setTurningSpeed(int newTurningSpeed) {
        this.turningSpeed = newTurningSpeed;
    }

    public void setArmorType(ArmorType newArmor) {
        this.armorType = newArmor;
    }
    
    public void setArmorThickness(int newArmorThickness) {
        this.armorThickness = newArmorThickness;
    }

    
}
