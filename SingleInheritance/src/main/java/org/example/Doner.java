package org.example;

class Doner extends Person {
    private String bloodBankName;
    private String donorType;
    private String donationDate;

    void setBloodBankName(String bloodBankName){
        this.bloodBankName = bloodBankName;
    }

    String getBloodBankName(){
        return this.bloodBankName;
    }

    void setDonorType(String donorType){
        this.donorType = donorType;
    }

    String getDonorType(){
        return this.donorType;
    }

    void setDonationDate(String donationDate){
        this.donationDate = donationDate;
    }

    String getDonationDate(){
        return this.donationDate;
    }

    public void displayDonationDetails(){
        System.out.println("Donation Details :" +
                "\nName : "+ getName() +
                "\nDate Of Birth : "+ getDataOfBirth() +
                "\nGender : "+ getGender() +
                "\nMobile Number : "+ getMobileNumber() +
                "\nBlood Group : "+ getBlood() +
                "\nBlood Bank Name : "+ getBloodBankName() +
                "\nDonor Type : "+ getDonorType() +
                "\nDonation Date : "+ getDonationDate());
    }
}
