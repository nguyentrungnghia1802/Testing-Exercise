
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest2 {
   @Test
   public void t1() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(-1, -1));
   }

   @Test
   public void t2() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(2, -1));
   }

   @Test
   public void t3() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(5, -1));
   }

   @Test
   public void t4() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(10, -1));
   }

   @Test
   public void t5() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(-1, 5));
   }

   @Test
   public void t6() {
      var Main = new Main();
      assertEquals(900000, Main.calculateRentalFee(2, 5));
   }

   @Test
   public void t7() {
      var Main = new Main();
      assertEquals(2050000, Main.calculateRentalFee(5, 5));
   }

   @Test
   public void t8() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(10, 5));
   }

   @Test
   public void t9() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(-1, 20));
   }

   @Test
   public void t10() {
      var Main = new Main();
      assertEquals(2000000, Main.calculateRentalFee(2, 20));
   }

   @Test
   public void t11() {
      var Main = new Main();
      assertEquals(3500000, Main.calculateRentalFee(5, 20));
   }

   @Test
   public void t12() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(10, 20));
   }

   @Test
   public void t13() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(-1, 31));
   }

   @Test
   public void t14() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(2, 31));
   }

   @Test
   public void t15() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(5, 31));
   }

   @Test
   public void t16() {
      var Main = new Main();
   assertThrows(Main.InvalidInputException.class, () -> Main.calculateRentalFee(10, 31));
   }
}
