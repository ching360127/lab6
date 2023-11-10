package com.example.myapplication;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static class Data{
        int photo;
        String name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] transNameArray = new String[]{"Bicycle","Motorbike","Car","plane","ship"};
        int[] transPhotoIdArray = new int[]{R.drawable.trans1, R.drawable.trans2 , R.drawable.trans1, R.drawable.trans1, R.drawable.trans5, R.drawable.trans6 };
        Data[] transData = new Data[transNameArray.length];
        for (int i=0; i < transData.length; i++) {
            transData[i] = new Data();
            transData[i].name = transNameArray[i];
            transData[i].photo = transPhotoIdArray[i];
        }
        MyAdapter transAdapter = new MyAdapter(this ,transData,R.layout.trans_list);
        Spinner spinner =findViewById(R.id.spinner);
        spinner.setAdapter(transAdapter);

        String[] cubeeNameArray = new String[]{"哭哭","發抖","再見","生氣","昏倒","竊笑","很棒","你好","驚訝","大笑"};
        int[] cubeePhotoIdArray = new int[]{R.drawable.cubee1, R.drawable.cubee2 , R.drawable.cubee3, R.drawable.cubee4,R.drawable.cubee5,R.drawable.cubee6,R.drawable.cubee7,R.drawable.cubee8,R.drawable.cubee9,R.drawable.cubee10};
        Data[] cubeeData = new Data[cubeeNameArray.length];
        for (int i=0; i < transData.length; i++) {
            cubeeData[i] = new Data();
            cubeeData[i].name = cubeeNameArray[i];
            cubeeData[i].photo = cubeePhotoIdArray[i];
        }
        MyAdapter cubeeAdapter = new MyAdapter(this ,cubeeData,R.layout.cubee_list);
        GridView gridView =findViewById(R.id.gridView);
        gridView.setAdapter(cubeeAdapter);
        gridView.setNumColumns(3);
    }
}

