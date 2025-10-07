
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// Đảm bảo import Main nếu ở package khác
// import path.to.Main;

public class MainTest {
    @Test
    public void t1() {
        var Main = new Main();
    assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(0, 15));
    }

    @Test
    public void t2() {
        var Main = new Main();
        assertEquals(450000, Main.calculateRentalFee(1, 15));
    }

    @Test
    public void t3() {
        var Main = new Main();
        assertEquals(900000, Main.calculateRentalFee(2, 15));
    }

    @Test
    public void t4() {
        var Main = new Main();
        assertEquals(1600000, Main.calculateRentalFee(4, 15));
    }

    @Test
    public void t5() {
        var Main = new Main();
        assertEquals(2950000, Main.calculateRentalFee(7, 15));
    }

    @Test
    public void t6() {
        var Main = new Main();
        assertEquals(3200000, Main.calculateRentalFee(8, 15));
    }

    @Test
    public void t7() {
        var Main = new Main();
    assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(9, 15));
    }

    @Test
    public void t8() {
        var Main = new Main();
    assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(4, 0));
    }

    @Test
    public void t9() {
        var Main = new Main();
        assertEquals(1600000, Main.calculateRentalFee(4, 1));
    }

    @Test
    public void t10() {
        var Main = new Main();
        assertEquals(1600000, Main.calculateRentalFee(4, 2));
    }

    @Test
    public void t11() {
        var Main = new Main();
        assertEquals(3500000, Main.calculateRentalFee(4, 29));
    }

    @Test
    public void t12() {
        var Main = new Main();
        assertEquals(3500000, Main.calculateRentalFee(4, 30));
    }

    @Test
    public void t13() {
        var Main = new Main();
    assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(4, 31));
    }

    @Test
    public void t14() {
        var Main = new Main();
        assertEquals(2000000, Main.calculateRentalFee(2, 30));
    }
}