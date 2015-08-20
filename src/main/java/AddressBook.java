import java.util.ArrayList;

public class AddressBook {
    private static ArrayList<AddressBook> entries = new ArrayList<AddressBook>();
    private String mFirstName;
    private String mLastName;
    private ArrayList<Phone> mPhones;
    private ArrayList<Address> mAddresses;
    private ArrayList<Email> mEmails;
    private ArrayList<Birthday> mBirthdays;

    private int mId;

    public AddressBook(String firstName, String lastName) {
      mFirstName = firstName;
      mLastName = lastName;

      entries.add(this);
      mId = entries.size();
      mPhones = new ArrayList<Phone>();
      mAddresses = new ArrayList<Address>();
      mEmails = new ArrayList<Email>();
      mBirthdays = new ArrayList<Birthday>();
      }

      public String getFirstName() {
        return mFirstName;
      }
      public String getLastName() {
        return mLastName;
      }
      public ArrayList<Phone> getPhones() {
        return mPhones;
      }
      public ArrayList<Address> getAddresses() {
        return mAddresses;
      }
      public ArrayList<Email> getEmails() {
        return mEmails;
      }
      public ArrayList<Birthday> getBirthdays() {
          return mBirthdays;
      }
      public int getId() {
        return mId;
      }
      public ArrayList<AddressBook> all() {
        return entries;
      }
      public void addPhone(Phone phone) {
        mPhones.add(phone);
      }
      public void addAddress(Address address) {
        mAddresses.add(address);
      }
      public void addEmail(Email email) {
        mEmails.add(email);
      }
      public void addBirthday(Birthday birthday) {
        mBirthdays.add(birthday);
      }

      public static void clear() {
        entries.clear();
      }

      public static AddressBook find(int id) {
        try {
          return entries.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
          return null;
        }
      }

}
