package com.example.listviewmathtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    //int x;
   // EditText number = (EditText) findViewById(R.id.editText2);
   // String S = number.getText().toString();
    String[] array = {"1","2","3","4","5","6","7","8","9","10"};
    int x;
    String S;
    ListView table;
    EditText number;


    //String array = Arrays.toString(arr);
        public void Table(View view) {
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            S = number.getText().toString();
            x = Integer.parseInt(S);
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
        table = findViewById(R.id.listView1);
        number = (EditText) findViewById(R.id.editText2);

        SeekBar valueBar;
        valueBar = findViewById(R.id.seekBar);
        valueBar.setMax(20);

        valueBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                int[] arr = {1,2,3,4,5,6,7,8,9,10};
                for (int j =0; j<arr.length; j++)
                {
                    arr[j]=arr[j]*i;
                }
                for(int j=0; j<arr.length; j++)
                    array[j]=String.valueOf(arr[j]);
                ArrayAdapter <String> myAdaptor = new ArrayAdapter <String> (MainActivity.this,android.R.layout.simple_list_item_1, array);
                table.setAdapter(myAdaptor);
               // Toast.makeText(MainActivity.this, Arrays.toString(arr), Toast.LENGTH_SHORT).show();
            }





            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        }




    }

