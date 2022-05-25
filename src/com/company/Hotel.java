package com.company;

public class Hotel extends Family implements Payments{

    public Hotel(int members, String address) {
        super(members, address);
    }

    @Override
    public void paymentType() {
        System.out.println("Hotel pay pulblic utilities fee");
    }

    public void getInfoOfHotels() {
        System.out.println("The address of Hotel: "+getAddress()+". Quantity of members: "+getMembers());
    }
}
