public class MainAbstraction {
    public static void main(String[] args) {
        BlackLab blackLab = new BlackLab();
        blackLab.printType();
        blackLab.printColor();

        Collion collion = new Collion();
        collion.printType();
        collion.printColor();

        Dalmation dalmation = new Dalmation();
        dalmation.printType();
        dalmation.printColor();
    }
}
