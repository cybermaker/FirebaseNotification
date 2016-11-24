package com.egco428.firebasenotification;

/**
 * Created by 6272user on 11/24/2016 AD.
 */
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseMessagingService extends FirebaseMessagingService {

    public void onMessageReceived(RemoteMessage remoteMessage){

        for(String k:remoteMessage.getData().keySet()){
            String s = remoteMessage.getData().get(k);
            Log.i("Result","onMessageReceived"+s);
        }
        if(remoteMessage.getNotification() != null ){
            String s = remoteMessage.getNotification().getBody();
            Log.i("Result","onMessageReceived"+s);
        }
    }
}

