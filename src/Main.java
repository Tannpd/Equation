
import Controller.Manager;
public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Calculate Superlative Equation", "Calculate Quadratic Equation"};
        Manager manager = new Manager("Main Menu", mChon, "exit");
        manager.run();
    }
}
