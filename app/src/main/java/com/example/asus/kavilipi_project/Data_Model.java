package com.example.asus.kavilipi_project;

public class Data_Model {

    // Getter and Setter model for recycler view items
    private String titleName;
    private String titleView;
    private String titleRate;
    private String titleDiet;

    private int imageLogo;
    private int imageUpdate;

    public Data_Model(String titleName, String titleView, String titleRate ,  int imageLogo, int imageUpdate) {

        this.titleName = titleName;
        this.titleView = titleView;
        this.titleRate = titleRate;
        this.titleDiet = titleDiet;


        this.imageLogo = imageLogo;
        this.imageUpdate = imageUpdate;
    }

    public String getTitleName() {
        return titleName;
    }

    public String getTitleView() {
        return titleView;
    }
    public String getTitleRate() {
        return titleRate;
    }


    public int getImageLogo() {
        return imageLogo;
    }
    public int getImageUpdate() {
        return imageUpdate;
    }
}