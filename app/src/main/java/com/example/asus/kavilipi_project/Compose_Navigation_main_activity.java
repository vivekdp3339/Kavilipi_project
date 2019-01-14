package com.example.asus.kavilipi_project;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import org.w3c.dom.Text;

public class Compose_Navigation_main_activity  extends AppCompatActivity implements View.OnClickListener{
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compose_navigation_main_xml);
        init();
    }


    public void init() {
        drawerLayout = ((DrawerLayout) findViewById(R.id.drawer_layout));

        ((ImageView) findViewById(R.id.leftdrawer)).setOnClickListener(this);



    }
    public void openLeft() {
        if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
            drawerLayout.closeDrawer(Gravity.LEFT);
        } else {
            drawerLayout.openDrawer(Gravity.LEFT);
        }
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.leftdrawer) {
            openLeft();
        }
    }

    public Text;
}
