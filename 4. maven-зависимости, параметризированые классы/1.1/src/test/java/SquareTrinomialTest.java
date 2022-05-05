import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTrinomialTest {

    @Test
    public void getAnswer_1() {
        // 1(x^2) + 4x - 12 = 0
        // x1 = -6
        // x2 = 2

        SquareTrinomial equation = new SquareTrinomial(1, 4, -12);
        double[] answer = equation.getAnswer();
        //double expected_0 = answer[0];
        assertEquals(answer[0], -6., 0);
        //double expected_1 = answer[1];
        assertEquals(answer[1], 2., 0);
    }

    @Test
    public void getAnswer_2() {
        // 4(x^2) - 4x + 1 = 0
        // x = 0.5

        SquareTrinomial equation = new SquareTrinomial(4, -4, 1);
        double[] answer = equation.getAnswer();

        assertEquals(answer[0], 0.5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnswer_3() {
        // 6(x^2) - 4x + 1 = 0
        // корней нет - исключение

        SquareTrinomial equation = new SquareTrinomial(6, -4, 1);
        double[] answer = equation.getAnswer();
    }
}