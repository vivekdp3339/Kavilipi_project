package com.example.asus.kavilipi_project;


public class Compose_Data_Model {

    // Getter and Setter model for recycler view items
    private String titleName;


    private int imageLogo;

    public Compose_Data_Model(String titleName,  int imageLogo) {

        this.titleName = titleName;




        this.imageLogo = imageLogo;

    }

    public String getTitleName() {
        return titleName;
    }




    public int getImageLogo()
    {
        return imageLogo;
    }

}