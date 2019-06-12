package com.example.a1894168.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editName,editEmail,editPassword;
        Button buttonSubmit,buttonExit;

        final String TAG="Info is: ";

        editName= findViewById(R.id.editName);
        editEmail=findViewById(R.id.editEmail);
        editPassword=findViewById(R.id.editPassword);

        buttonSubmit=findViewById(R.id.buttonSubmit);
        buttonExit=findViewById(R.id.buttonExit);



        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),editName.getText().toString(),Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),editEmail.getText().toString(),Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),editPassword.getText().toString(),Toast.LENGTH_LONG).show();
                Log.i(TAG,editName.getText().toString());
                Log.i(TAG,editEmail.getText().toString());
                Log.i(TAG,editPassword.getText().toString());



            }
        });
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Exit Application",Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
