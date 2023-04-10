package org.example;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Doner obj = new Doner();

        System.out.println("Enter the name :");
        obj.setName(sc.nextLine());

        System.out.println("Enter Date of Birth :");
        obj.setDataOfBirth(sc.nextLine());

        System.out.println("Enter Gender :");
        obj.setGender(sc.nextLine());

        System.out.println("Enter Mobile Number :");
        obj.setMobileNumber(sc.nextLine());

        System.out.println("Enter Blood Group :");
        obj.setBlood(sc.nextLine());

        System.out.println("Enter Blood Bank Name :");
        obj.setBloodBankName(sc.nextLine());

        System.out.println("Enter Donor Type :");
        obj.setDonorType(sc.nextLine());

        System.out.println("Enter Donation Date :");
        obj.setDonationDate(sc.nextLine());

        obj.displayDonationDetails();

    }
}