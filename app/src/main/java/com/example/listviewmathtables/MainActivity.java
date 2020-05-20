package com.example.listviewmathtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    //int x;
   // EditText number = (EditText) findViewById(R.id.editText2);
   // String S = number.getText().toString();
    String[] array = {"1","2","3","4","5","6","7","8","9","10"};

    //String array = Arrays.toString(arr);
        public void Table(View view) {
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            ListView table = findViewById(R.id.listView1);
            EditText number = (EditText) findViewById(R.id.editText2);
        String S = number.getText().toString();
        int x = Integer.parseInt(S);


        //int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i =0; i<arr.length; i++)
        {
            arr[i]=arr[i]*x;
        }
       for(int i=0; i<arr.length; i++)
            array[i]=String.valueOf(arr[i]);
           ArrayAdapter <String> myAdaptor = new ArrayAdapter <String> (this,android.R.layout.simple_list_item_1, array);
           table.setAdapter(myAdaptor);

        Toast.makeText(this, Arrays.toString(arr), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ArrayAdapter <String> myAdaptor = new ArrayAdapter <String> (this,android.R.layout.simple_list_item_1, Collections.singletonList(array));
        //ListView table = findViewById(R.id.listView1);
       // ArrayAdapter <String> myAdaptor = new ArrayAdapter <String> (this,android.R.layout.simple_list_item_1, array);
       // table.setAdapter(myAdaptor);




    }
}
