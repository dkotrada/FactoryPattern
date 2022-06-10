public class FactoryPattern {
    public static void main(String[] args) {
        Motor electric = MotorFactory.createMotor("electricity");
        if (electric != null) {
            electric.energySource();
        }
    }
}
