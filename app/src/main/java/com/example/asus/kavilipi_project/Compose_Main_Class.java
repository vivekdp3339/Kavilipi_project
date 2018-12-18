package com.example.asus.kavilipi_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Compose_Main_Class extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager view_pager;
    Compose_ViewPagerAdapter adapter;
    Compose_SlidingTabLayout tabs;
    CharSequence Titles[]={"Compose","Draft"};
    int Numboftabs =2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compose_footer_main_class);

        /*toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);*/
        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter =  new Compose_ViewPagerAdapter(getSupportFragmentManager(),Titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        view_pager = (ViewPager) findViewById(R.id.view_pager);
        view_pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (Compose_SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new Compose_SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.colorAccent);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(view_pager);




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

        ImageButton library_footer;
        library_footer= (ImageButton)findViewById(R.id.library_footer);
        library_footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inLibrary = new Intent(getApplicationContext(), Library_Main_Class.class);
                startActivity(inLibrary);
            }
        });


/*
        ImageButton compose_footer;
        compose_footer= (ImageButton)findViewById(R.id.compose_footer);
        compose_footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent incompose = new Intent(getApplicationContext(), Compose_Main_Class.class);
                startActivity(incompose);
            }
        });
*/




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
