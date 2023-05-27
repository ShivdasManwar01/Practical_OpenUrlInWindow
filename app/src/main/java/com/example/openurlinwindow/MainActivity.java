package com.example.openurlinwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    EditText url;
    Button btn;
    String strURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url=(EditText) findViewById(R.id.url);
        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strURL=url.getText().toString();
                if(strURL.indexOf("http://www.")<0){
                    strURL="http://www."+strURL;
                }
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(strURL));
                startActivity(intent);
            }
        });
    }
}