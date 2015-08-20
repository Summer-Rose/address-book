import org.junit.*;
import static org.junit.Assert.*;

public class EmailTest {

  @Test
  public void email_instantiatesCorrectly() {
    Email testEmail = new Email("magic", "gob@badmagicians.wtf");
    assertEquals(true, testEmail instanceof Email);
  }

  @Test
  public void email_getCorrectType() {
    Email testEmail = new Email("magic", "gob@badmagicians.wtf");
    assertEquals("magic", testEmail.getType());
  }

  @Test
  public void email_getCorrectEmail() {
    Email testEmail = new Email("magic", "gob@badmagicians.wtf");
    assertEquals("gob@badmagicians.wtf", testEmail.getEmail());
  }

}
