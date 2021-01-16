package com.randhir.parseproject;

import android.app.Application;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import java.util.List;

public class StarterApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        //

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("myappID")
                // if defined
                .clientKey("QWZ1YdJ4lmBI")
                .server("http://3.16.14.253/parse")
                .build()
        );

     /*    Creating Object and Adding Properties *

        ParseObject score = new ParseObject("score");
        score.put("username","Sanchit"); // Properties
        score.put("score",95);
        //Saving the object in server
        score.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if(e == null){
                    //OK
                    Log.i("Success", " We saved the score");
                }else {
                    e.printStackTrace();
                }
            }
        }); // We can add multiple objects in server */

     /* Getting/Accessing the object from server
        ParseQuery <ParseObject> query = ParseQuery.getQuery("score");
        query.getInBackground("zWneV3bLQi", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if(e ==  null && object != null){
                    //Updating values also updates in server
                    object.put("score",80);
                    object.saveInBackground();

                    Log.i("username",object.getString("username"));
                    Log.i("score",Integer.toString(object.getInt("score")));
                }else{
                    e.printStackTrace();
                }
            }
        });    */

   /*     ParseQuery <ParseObject> query = ParseQuery.getQuery("score");

       // query.whereEqualTo("username","Randhir"); // If we want only Randhir's
       // query.setLimit(1); // If we want only 1 randhir

        query.whereGreaterThan("score" , 82); // If score is greater than 82

        query.findInBackground(new FindCallback<ParseObject>() { // We didn't mentioned any specific id so we got LIST of ParseObjects below
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e == null){
                    if(objects.size() > 0){
                        for(ParseObject score : objects){
                            score.put("score",score.getInt("score")+10 ); // Updating score if > 82
                            score.saveInBackground();
                           // Log.i("username",object.getString("username"));
                           // Log.i("score",Integer.toString(object.getInt("score")));
                        }
                    }
                }else{
                    e.printStackTrace();
                }
            }
        });  */



     //   ParseUser.enableAutomaticUser(); - If you want an auto login just to check te app

        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }




}

