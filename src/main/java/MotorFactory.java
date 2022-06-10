public class MotorFactory {
    public static Motor createMotor(String energysource) {
        switch (energysource) {
            case "electricity":
                return new ElectricCar();
            case "diesel":
                return new DieselCar();
            case "gasoline":
                return new GasolineCar();
            default:
                return null;
        }
    }
}

