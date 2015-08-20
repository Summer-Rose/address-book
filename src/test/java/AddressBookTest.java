import org.junit.*;
import static org.junit.Assert.*;

public class AddressBookTest {

  @Test
  public void addressBook_instantiatesCorrectly() {
    AddressBook testAddressBook = new AddressBook("Gob", "Bluth");
    assertEquals(true, testAddressBook instanceof AddressBook);
  }

  @Test
  public void addressBook_returnsCorrectFirstName_Gob() {
    AddressBook testAddressBook = new AddressBook("Gob", "Bluth");
    assertEquals("Gob", testAddressBook.getFirstName());
  }

  @Test
  public void addressBook_returnsCorrectLastName_Bluth() {
    AddressBook testAddressBook = new AddressBook("Gob", "Bluth");
    assertEquals("Bluth", testAddressBook.getLastName());
  }
}
