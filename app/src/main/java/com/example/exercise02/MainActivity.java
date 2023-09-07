package com.example.exercise02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstname,lastname;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = (EditText) findViewById(R.id.firstnameEditText);
        lastname = (EditText) findViewById(R.id.lastnameEditText);
        show = (Button) findViewById(R.id.button);

    }

    public void showMsg(View view) {
        String fname = firstname.getText().toString();
        String lname =lastname.getText().toString();
        Toast msg = Toast.makeText(this, "Full name is: "+fname+" "+lname, Toast.LENGTH_LONG);
        msg.show();

    }
}