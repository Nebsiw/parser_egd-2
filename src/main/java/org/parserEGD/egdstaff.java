package org.parserEGD;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.parserEGD.model.Info;
import org.parserEGD.model.Root;
import org.parserEGD.model.Users;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class egdstaff {

    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_STAFF = "staff";
    private static final String TAG_NAME = "name";
    private static final String TAG_Login = "gusoev_login";
    private static final String TAG_Type = "type";
    private static final String TAG_Roles = "roles";
    private static final String TAG_Info = "user";
    private static final String TAG_User_Phone = "phone_number";
    private static final String TAG_User_databrith = "date_of_birth";
    private static final String TAG_User_email = "email";

    public Root parse(){

        Root root = new Root();

        JSONParser parser = new JSONParser();
        try(FileReader reader = new FileReader("newstaff.json")){
            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            String name = (String) rootJsonObject.get(TAG_NAME_MAIN);

            JSONArray staffJsonArray = (JSONArray) rootJsonObject.get(TAG_STAFF);
            List<Users> usersList = new ArrayList<>();

            for(Object it: staffJsonArray)
            {
                JSONObject staffJsonObject = (JSONObject) it;

                String nameusers = (String) staffJsonObject.get(TAG_NAME);
                String loginusers = (String) staffJsonObject.get(TAG_Login);
                String typeusers = (String) staffJsonObject.get(TAG_Type);
                //String rolesusers = (String) staffJsonObject.get(TAG_Roles);

                JSONArray infoJsonArray = (JSONArray) staffJsonObject.get(TAG_Info);
                List<Info> infoList = new ArrayList<>();

                for(Object x:infoJsonArray){
                    JSONObject infoJsonObject = (JSONObject) x;

                    String info_phone_number = (String) infoJsonObject.get(TAG_User_Phone);
                    String info_date_of_birth = (String) infoJsonObject.get(TAG_User_databrith);
                    String info_email = (String) infoJsonObject.get(TAG_User_email);

                    Info info = new Info(info_phone_number, info_date_of_birth,info_email
                    );
                    infoList.add(info);


                }


                Users users = new Users(nameusers, loginusers, typeusers, infoList);
                usersList.add(users);

            }


            root.setName(name);
            root.setStaff(usersList);

            return root;

        }catch (Exception e) {
            System.out.println("parsing error" + e);
        }

        return null;
    }
}
