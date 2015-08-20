public class Address {
  private String mStreet;
  private String mCity;
  private String mState;
  private int mZip;

  public Address(String street, String city, String state, int zip) {
    mStreet = street;
    mCity = city;
    mState = state;
    mZip = zip;
  }
  public String getStreet() {
    return mStreet;
  }
  public String getCity() {
    return mCity;
  }
  public String getState() {
    return mState;
  }
  public int getZip() {
    return mZip;
  }
}
