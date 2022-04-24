package com.example.devsufy;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity{
    EditText phone,sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        phone=findViewById(R.id.phone);
        sms=findViewById(R.id.sms);
        String phone_url="smsto:"+phone.getText().toString();
        Intent intent=new Intent(Intent.ACTION_SENDTO,Uri.parse(phone_url));
        intent.putExtra("sms_body",sms.getText().toString());
        startActivity(intent);
    }
}
