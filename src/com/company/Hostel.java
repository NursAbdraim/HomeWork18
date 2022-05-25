package com.company;

public class Hostel extends Family implements Payments {

    public Hostel(int members, String address) {
        super(members, address);
    }

    @Override
    public void paymentType() {
        System.out.println("Hostel pays public utilities fee");
    }

    public void getInfoOfHostel() {
        System.out.println("The address of Hostel: "+getAddress()+". Quantity of members: "+getMembers());
    }
}
