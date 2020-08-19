package com.example.pushtest;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.e(TAG, token);

        sendRegistrationToServer(token);
    }


    // 앱 서버로 토큰을 보낼 때 활용
    private void sendRegistrationToServer(String token) {

    }
}
