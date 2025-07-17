package CarRentalSystem;

public class Location
{
    String address;
    String city;
    String landmark;
    int pincode;

    public Location(String address,String city,String landmark,int pincode)
    {
        this.address=address;
        this.city=city;
        this.landmark=landmark;
        this.pincode=pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
