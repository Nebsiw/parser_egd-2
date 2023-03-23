package org.parserEGD.model;

public class Info {
    private String phone_number;
    private String date_of_birth;
    private String email;

    public Info(String phone_number, String date_of_birth, String email) {
        this.phone_number = phone_number;
        this.date_of_birth = date_of_birth;
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Info{" +
                "phone_number='" + phone_number + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
