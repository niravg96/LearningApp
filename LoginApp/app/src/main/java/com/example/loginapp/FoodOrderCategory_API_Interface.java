package com.example.loginapp;

import static com.facebook.FacebookSdk.getApplicationContext;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.loginapp.FoodOrderCategory_Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodOrderCategory_API_Interface {

   /* SharedPreferences sh = getApplicationContext().getSharedPreferences("CATEGORY_ID", Context.MODE_PRIVATE);
    String Cat_id = sh.getString("CAT_ID","");
    String stringtobeinserted = Cat_id;
    int index = 46;
    String original = "/getSubCateogryProductList?deptids=[2]&cat_id=19&sub_id=0";
    String url = insertString(original,stringtobeinserted,index);*/

    @GET("/getSubCateogryProductList?deptids=[2]&cat_id=19&sub_id=0")

    Call<List<FoodOrderCategory_Data>> getDetails();

   /* static String insertString(String original,String stringtobeinserted,int index)
    {
        String newstring = original.substring(0,index+1)+stringtobeinserted+original.substring(index+1);

        return newstring;
    }*/
}

