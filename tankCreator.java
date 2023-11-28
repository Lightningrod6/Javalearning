import java.util.Scanner;

public class tankCreator {

    public enum TankType {
        LIGHT, MEDIUM, HEAVY
    }
    public enum ArmorType {
        EXPLOSIVE_REACTIVE,
        NON_EXPLOSIVE_REACTIVE,
        COMPOSITE,
        STEEL
    }
    
    public enum ShellType {
        ARMOR_PIERCING,
        HIGH_EXPLOSIVE,
        HEAT,
        SABOT
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
        scanner.close();
        return this.tankType;

        
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
        System.out.println("Tank Shell Ammo: " + shell);
        System.out.println("Shell Velocity: " + shellVelocity + "");
        System.out.println("Shell Type: " + shellType);
    }

	public void setTankType(TankType newTankType) {
        this.tankType = newTankType;
	}
}
