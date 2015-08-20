import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;


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

  @Test
  public void addressBook_entryInstantiatesWithAnId_true() {
    AddressBook testAddressBook = new AddressBook("Gob", "Bluth");
    assertEquals(AddressBook.all().size(), testAddressBook.getId());
  }

  @Test
  public void addressBook_returnsCorrectId() {
    AddressBook testAddressBook1 = new AddressBook("Gob", "Bluth");
    AddressBook testAddressBook2 = new AddressBook("Loose", "Seal");
    assertEquals(AddressBook.find(testAddressBook2.getId()), testAddressBook2);
  }

  @Test
  public void addressBook_emptiesArray_Zero() {
    AddressBook testAddressBook = new AddressBook("Gob", "Bluth");
    testAddressBook.clear();
    assertEquals(0, testAddressBook.all().size());
  }
}
