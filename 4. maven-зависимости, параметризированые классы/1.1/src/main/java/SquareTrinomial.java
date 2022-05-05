import java.util.ArrayList;

//здесь хранится квадратный трехчлен вида Ax^2 + Bx + C
public class SquareTrinomial {
    private double A, B, C;

    public SquareTrinomial(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getA() {
        return A;
    }
    public double getB() {
        return B;
    }
    public double getC() {
        return C;
    }

    public void setA(double A) {
        this.A = A;
    }
    public void setB(double B) {
        this.B = B;
    }
    public void setC(double C) {
        this.C = C;
    }

    public double[] getAnswer() throws IllegalArgumentException {
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double D;
        D = B * B - 4 * A * C;
        if (D > 0) {
            double x1, x2;
            x1 = (-B - Math.sqrt(D)) / (2 * A);
            x2 = (-B + Math.sqrt(D)) / (2 * A);
            arrayList.add(x1);
            arrayList.add(x2);
        }
        else if (D == 0) {
            double x;
            x = -B / (2 * A);
            arrayList.add(x);
        }
        else if (D < 0) {
            throw new IllegalArgumentException();
        }

        double[] result = new double[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}