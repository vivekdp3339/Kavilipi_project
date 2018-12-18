package com.example.asus.kavilipi_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Library_Main_Class extends AppCompatActivity {
    private RecyclerView recyclerView , veri_recycler;
    private ArrayList<Library_Data_Model> horizontalList;
    private  ArrayList<Library_vertical_Data_model> verticalList;
    private Library_Horizontal_CustomAdapter horizontalAdapter;
    private Library_CustomVerticalAdapter verticalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library_footer_main_class);

        //-------------Horizontal RecyclerView-----------------


        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);

        veri_recycler=(RecyclerView)findViewById(R.id.verti_recycler_view);



        horizontalList = new ArrayList<Library_Data_Model>();
        for (int i = 0; i < Library_MyData.TITLES.length; i++) {
            horizontalList.add(new Library_Data_Model(
                    Library_MyData.TITLES[i],Library_MyData.VIEW[i], Library_MyData.RATE[i], Library_MyData.IMAGES[i]
            ));
        }
        horizontalAdapter=new Library_Horizontal_CustomAdapter(horizontalList);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(Library_Main_Class.this, LinearLayoutManager.HORIZONTAL, false);


        //--------Vertical Adapter---------------



        //---------------Vertical---------------

        verticalList = new ArrayList<Library_vertical_Data_model>();
        for (int i = 0; i < Library_MyVertiData.TITLES.length; i++) {
            verticalList.add(new Library_vertical_Data_model(
                    Library_MyVertiData.TITLES[i],Library_MyVertiData.SUB[i],Library_MyVertiData.VIEW[i], Library_MyVertiData.RATE[i], Library_MyVertiData.IMAGES[i]
            ));
        }


        verticalAdapter=new Library_CustomVerticalAdapter(verticalList);
        LinearLayoutManager VerticalLayoutManagaer
                = new LinearLayoutManager(Library_Main_Class.this, LinearLayoutManager.VERTICAL, false);

        //--------------------Horizontal RecyclerView----------

        recyclerView.setLayoutManager(horizontalLayoutManagaer);
        recyclerView.setAdapter(horizontalAdapter);


        //-------------------------Vertical RecyclerView

        veri_recycler.setLayoutManager(VerticalLayoutManagaer);
        veri_recycler.setAdapter(verticalAdapter);



        //-------------------footer code


        ImageButton home_pub;
        home_pub= (ImageButton) findViewById(R.id.home_footer);
        home_pub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        /*
        ImageButton library_footer;
        library_footer= (ImageButton)findViewById(R.id.library_footer);
        library_footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inLibrary = new Intent(getApplicationContext(), Library_Main_Class.class);
                startActivity(inLibrary);
            }
        });
*/


        ImageButton compose_footer;
        compose_footer= (ImageButton)findViewById(R.id.compose_footer);
        compose_footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent incompose = new Intent(getApplicationContext(), Compose_Main_Class.class);
                startActivity(incompose);
            }
        });




        ImageButton update_pub;
        update_pub= (ImageButton)findViewById(R.id.update_footer);
        update_pub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Update_footer_Main.class);
                startActivity(i);
            }
        });



        ImageButton profile_footer;
        profile_footer= (ImageButton)findViewById(R.id.profile_footer);
        profile_footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infooter = new Intent(getApplicationContext(), Profile_MainClass.class);
                startActivity(infooter);
            }
        });









    }



}