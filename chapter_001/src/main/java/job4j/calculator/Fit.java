package job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) *1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110) *1.15;;
        return rsl;
    }

    public static void main(String[] args) {
        double height = 200;
        double man = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman " + height + " is " + woman);
    }

}
