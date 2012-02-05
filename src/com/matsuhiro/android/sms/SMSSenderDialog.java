package com.matsuhiro.android.sms;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SMSSenderDialog extends Dialog {

    public SMSSenderDialog(Context context) {
        super(context);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_sender_dialog);
        this.setTitle("SMS sender");
        final EditText phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        final EditText message = (EditText) findViewById(R.id.sms_message);
        
        
        Button btn = (Button)findViewById(R.id.sendSMS);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String destinationAddress = phoneNumber.getText().toString();
                String text = message.getText().toString();
                
                smsManager.sendTextMessage(destinationAddress, null, text, null, null);
                dismiss();
            }
            
        });
    }

}
