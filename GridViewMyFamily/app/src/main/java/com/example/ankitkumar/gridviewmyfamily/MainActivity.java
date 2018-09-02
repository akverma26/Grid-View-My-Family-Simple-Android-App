package com.example.ankitkumar.gridviewmyfamily;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void openImage(int index){
        ImageView img = (ImageView)findViewById(R.id.img);
        img.setImageResource(index);
        img.setVisibility(View.VISIBLE);
        ((GridLayout)findViewById(R.id.grid)).setVisibility(View.INVISIBLE);
    }

    public void close(View view){
        ((ImageView)view).setVisibility(View.INVISIBLE);
        ((GridLayout)findViewById(R.id.grid)).setVisibility(View.VISIBLE);
    }

    public void open(View view){
        String id = view.getResources().getResourceEntryName(view.getId());
        int index = getResources().getIdentifier(id,"drawable","com.example.ankitkumar.gridviewmyfamily");
        openImage(index);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
