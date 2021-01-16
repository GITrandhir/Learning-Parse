package com.randhir.parseproject;

import android.os.Bundle;
import android.util.Log;

import com.parse.LogInCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /*   ParseUser user = new ParseUser();

        user.setUsername("Randhir");
        user.setPassword("Pass");

        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if( e == null){
                    //OK
                    Log.i("Signed up", "We did it");
                }else{
                    e.printStackTrace();
                }
            }
        }); */

     /*   ParseUser.logInInBackground("Randhir", "Pass", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if(user != null){
                    Log.i("Logged In", "done: ");
                }else{
                    e.printStackTrace();
                }
            }
        }); */

    /* if(ParseUser.getCurrentUser() != null){
         Log.i("Signed In" , ParseUser.getCurrentUser().getUsername());
     }else{
         Log.i("Not signed In", "onCreate: ");
     } */

    // ParseUser.logOut();

        ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }
}