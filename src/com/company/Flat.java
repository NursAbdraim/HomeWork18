package com.company;

public class Flat extends Family implements Payments{

    public Flat(int members, String address) {
        super(members, address);
    }


    @Override
    public void paymentType() {
        System.out.println("Flat pays rental Fee");
    }

    public void getInfoOfFlat() {
        System.out.println("The address of Flat: "+getAddress()+". Quantity of members: "+getMembers());
    }
}
