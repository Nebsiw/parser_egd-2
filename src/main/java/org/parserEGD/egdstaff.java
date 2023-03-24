package org.parserEGD;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.parserEGD.model.Root;
import org.parserEGD.model.Users;

import java.io.FileReader;
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



    public Root parse() {

        Root root = new Root();

        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("newstaff.json")) {
            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            //String name = (String) rootJsonObject.get(TAG_NAME_MAIN);

            JSONArray staffJsonArray = (JSONArray) rootJsonObject.get(TAG_STAFF);
            List<Users> usersList = new ArrayList<>();

            for (Object it : staffJsonArray) {
                JSONObject staffJsonObject = (JSONObject) it;

                String nameusers = (String) staffJsonObject.get(TAG_NAME);
                String loginusers = (String) staffJsonObject.get(TAG_Login);
                String typeusers = (String) staffJsonObject.get(TAG_Type);
                JSONArray rolesusers = (JSONArray) staffJsonObject.get(TAG_Roles);

                JSONObject InfoJsonObject = (JSONObject) staffJsonObject.get(TAG_Info);
                String phone_number_info;
                String email_info;
                String data_brith_info;

                if (InfoJsonObject != null) {
                    phone_number_info = (String) InfoJsonObject.get(TAG_User_Phone);
                    email_info = (String) InfoJsonObject.get(TAG_User_email);
                    data_brith_info = (String) InfoJsonObject.get(TAG_User_databrith);
                } else {
                    phone_number_info = "";
                    email_info = "";
                    data_brith_info = "";
                }


                Users users = new Users(nameusers, loginusers, typeusers, rolesusers, email_info, phone_number_info, data_brith_info);
                usersList.add(users);

            }


            //root.setName(name);
            root.setStaff(usersList);

            return root;

        } catch (Exception e) {
            System.out.println("parsing error" + e);
        }

        return null;
    }
}
