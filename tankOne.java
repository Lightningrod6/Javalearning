
public class tankOne {
    public static void main(String[] args) {
        tankCreator javelin = new tankCreator();
        tankCreator.TankType decision = javelin.tankDecider();
        if (decision == tankCreator.TankType.LIGHT) {
            System.out.println("Selected tank type: LIGHT");
        } else if (decision == tankCreator.TankType.MEDIUM) {
            System.out.println("Selected Tank Type: Medium");
        }
    }
}