package org.example;

public class Address {

    private String city = "Celina";
    private String state = "Ohio";
    private String country = "USA";
    private String zipcode = "45822";

    public String getCity() {

        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
