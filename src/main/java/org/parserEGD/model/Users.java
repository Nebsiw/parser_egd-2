package org.parserEGD.model;

import java.util.List;

public class Users {
    private String name;
    private String gusoev_login;
    private String type;
    private List<Info> infoList;

    public Users(String name, String gusoev_login, String type, List<Info> infoList) {
        this.name = name;
        this.gusoev_login = gusoev_login;
        this.type = type;
        this.infoList = infoList;
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

    public List<Info> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<Info> infoList) {
        this.infoList = infoList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", gusoev_login='" + gusoev_login + '\'' +
                ", type='" + type + '\'' +
                ", infoList=" + infoList +
                '}';
    }
}


