package com.company;

public class Family {
    private int members;
    private String address;
    private Flat[] flats;
    private Hotel[] hotels;
    private Hostel[] hostels;

    public Family(int members, String address) {
        this.members = members;
        this.address = address;
    }

    public Family() {
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    public Hotel[] getHotels() {
        return hotels;
    }

    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public Hostel[] getHostels() {
        return hostels;
    }

    public void setHostels(Hostel[] hostels) {
        this.hostels = hostels;
    }

    public void getInfoOfFamily() {
        for(Hotel i: getHotels())
            i.getInfoOfHotels();

        for(Hostel i: getHostels())
            i.getInfoOfHostel();

        for(Flat i: getFlats())
            i.getInfoOfFlat();
    }


}
