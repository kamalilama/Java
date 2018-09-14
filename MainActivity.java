package com.example.rm0016nc.student;

import java.util.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    private EditText test1;
    private EditText test2;
    private EditText test3;
    private TextView lblFirst;
    private TextView lblLast;
    private TextView lblTest1;
    private TextView lblTest2;
    private TextView lblTest3;
    private Button btnAdd;
    private TextView multiLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList Student = new ArrayList();

        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        test1 = (EditText) findViewById(R.id.test1);
        test2 = (EditText) findViewById(R.id.test2);
        test3 = (EditText) findViewById(R.id.test3);
        lblFirst = (TextView) findViewById(R.id.lblFirst);
        lblLast = (TextView) findViewById(R.id.lblLast);
        lblTest1 = (TextView) findViewById(R.id.lblTest1);
        lblTest2 = (TextView) findViewById(R.id.lblTest2);
        lblTest3 = (TextView) findViewById(R.id.lblTest3);
        multiLine = (TextView) findViewById(R.id.multiLine);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v) {

               String fname = firstName.getText().toString();
               String lname = lastName.getText().toString();
               String Test1 = test1.getText().toString();
               String Test2 = test2.getText().toString();
               String Test3 = test3.getText().toString();

               Student.add(fname);
               Student.add(lname);
               Student.add(Test1);
               Student.add(Test2);
               Student.add(Test3);

//               String tmp = getResources().getString(R.string.line);
               multiLine.setText(Student.toString());
           }
        });
    }

}
