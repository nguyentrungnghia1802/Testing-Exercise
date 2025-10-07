import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest3 {
    @Test
    public void t1() {
        var main = new Main();
        assertThrows(Main.InvalidInputException.class, () -> main.calculateRentalFee(4, -1)); // t1: đường đi 0-1-2(F)-8(F)-14
    }

    @Test
    public void t2() {
        var main = new Main();
        assertThrows(Main.InvalidInputException.class, () -> main.calculateRentalFee(-1, 8)); // t2: đường đi 0-1-2(T)-3(F)-5(F)-7
    }

    @Test
    public void t3() {
        var main = new Main();
        assertEquals(2050000, main.calculateRentalFee(5, 8)); // t3: đường đi 0-1-2(T)-3(F)-5(T)-6-15
    }

    @Test
    public void t4() {
        var main = new Main();
        assertEquals(900000, main.calculateRentalFee(2, 8)); // t4: đường đi 0-1-2(T)-3(T)-4-15
    }

    @Test
    public void t5() {
        var main = new Main();
        assertThrows(Main.InvalidInputException.class, () -> main.calculateRentalFee(-1, 20)); // t5: đường đi 0-1-2(F)-8(T)-9(F)-11(F)-13
    }

    @Test
    public void t6() {
        var main = new Main();
        assertEquals(3500000, main.calculateRentalFee(5, 20)); // t6: đường đi 0-1-2(F)-8(T)-9(T)-11(T)-12-15
    }

    @Test
    public void t7() {
        var main = new Main();
        assertEquals(2000000, main.calculateRentalFee(2, 20)); // t7: đường đi 0-1-2(F)-8(T)-9(T)-10-15
    }
}
