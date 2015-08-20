import org.junit.*;
import static org.junit.Assert.*;

public class AddressTest {

  @Test
  public void address_instantiatesCorrectly() {
    Address testAddress = new Address("123 Street Lane", "Portlandia", "ER", 12523);
    assertEquals(true, testAddress instanceof Address);
  }
  @Test
  public void getStreet_returnCorrectStreet() {
    Address testAddress = new Address("123 Street Lane", "Portlandia", "ER", 12523);
    assertEquals("123 Street Lane", testAddress.getStreet());
  }
  @Test
  public void getZip_returnCorrectZip() {
    Address testAddress = new Address("123 Street Lane", "Portlandia", "ER", 12523);
    assertEquals(12523, testAddress.getZip());
  }
}
