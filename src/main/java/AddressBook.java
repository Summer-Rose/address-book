import java.util.ArrayList;

public class AddressBook {
    private static ArrayList<AddressBook> entries = new ArrayList<AddressBook>();
    private String mFirstName;
    private String mLastName;
    private ArrayList<Phone> mPhones;
    private ArrayList<Address> mAddresses;
    private ArrayList<Email> mEmails;
    private ArrayList<Birthday> mBirthdays;

    private int mSize;

    public AddressBook(String firstName, String lastName) {
      mFirstName = firstName;
      mLastName = lastName;
      mBirthMonth = birthMonth;
      mBirthDay = birthDay;

      this.add(entries);
      mSize = entries.size();
      mPhones = new ArrayList<Phone>();
      mAddresses = new ArrayList<Address>();
      mEmails = new ArrayList<Email>();
      mBirthdays = new ArrayList<Birthday>();
      }
}
