package com.company;

public class Main {

    public static void main(String[] args) {
        Hotel[] familyHotel1 = {new Hotel(9, "Gorkiy 141")};


        Flat[] familyFlat1 = {new Flat(5,"9-mkr")};


        Hostel[] familyHostel1 = {new Hostel(6,"Pishpek")};


        Family family = new Family();
        family.setHotels(familyHotel1);
        family.setFlats(familyFlat1);
        family.setHostels(familyHostel1);
        family.getInfoOfFamily();
    }
}
