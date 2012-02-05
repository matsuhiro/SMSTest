package com.matsuhiro.android.sms;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SMSTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn_sender = (Button) findViewById(R.id.launchSMS);
        btn_sender.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SMSSenderDialog dialog = new SMSSenderDialog(v.getContext());
                dialog.show();
            }
            
        });
    }
}