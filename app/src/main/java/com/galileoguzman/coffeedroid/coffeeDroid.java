package com.galileoguzman.coffeedroid;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by galileoguzman on 31/03/15.
 */
public class coffeeDroid extends Application {

    public void onCreate() {

        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "sjF7ELxS1Usw940vaKUZ9b6sFDQq7GcSBVksEgjm", "4bXCi2BULIwVKp1m27Gt1xauhcF2uivyZiNPXLyh");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}
