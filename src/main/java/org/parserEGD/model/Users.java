package org.parserEGD.model;

import org.json.simple.JSONArray;

public class Users {
    private String name;
    private String gusoev_login;
    private String type;
    private JSONArray roles;
    private String email;
    private String phone_number;
    private String date_of_birth;


    public Users(String name, String gusoev_login, String type, JSONArray roles, String email, String phone_number, String date_of_birth) {
        this.name = name;
        this.gusoev_login = gusoev_login;
        this.type = type;
        this.roles = roles;

        this.email = email;
        this.phone_number = phone_number;
        this.date_of_birth = date_of_birth;
    }

    public String getName() {
        return name;
    }

    public String getGusoev_login() {
        return gusoev_login;
    }

    public String getType() {
        return type;
    }

    public JSONArray getRoles() {
        return roles;
    }


    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    @Override
    public String toString() {
        return name + ';' + gusoev_login + ';' + type + ';' + roles + ';' + email + ';' + phone_number + ';' + date_of_birth + "\n";
    }
}


