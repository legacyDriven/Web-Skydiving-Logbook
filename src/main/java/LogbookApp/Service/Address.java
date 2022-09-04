package LogbookApp.Service;

class Address {
    private String country;
    private String city;
    private long estateNumber;
    private long apartmentNumber;
    private String postalCode;

    public Address(String country, String city, long estateNumber, long apartmentNumber, String postalCode) {
        this.country = country;
        this.city = city;
        this.estateNumber = estateNumber;
        this.apartmentNumber = apartmentNumber;
        this.postalCode = postalCode;
    }
}
