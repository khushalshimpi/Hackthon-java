package org.example;

public class Person {
    private String name;
    private String dataOfBirth;
    private String gender;
    private String mobileNumber;
    private String blood;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    String getDataOfBirth() {
        return this.dataOfBirth;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    String getGender() {
        return this.gender;
    }

    void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    String getMobileNumber() {
        return this.mobileNumber;
    }

    void setBlood(String blood) {
        this.blood = blood;
    }

    String getBlood() {
        return this.blood;
    }
}
