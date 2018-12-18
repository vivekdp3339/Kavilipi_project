package com.example.asus.kavilipi_project;

public class Library_vertical_Data_model  {

    // Getter and Setter model for recycler view items
    private String verti_titleName;
    private String verti_subtitleName;
    private String verti_titleview;
    private String verti_titlerate;

    private int verti_imageLogo;

    public Library_vertical_Data_model(String verti_titleName,String verti_subtitleName,String verti_titleview, String verti_titlerate,int verti_imageLogo) {

        this.verti_titleName = verti_titleName;
        this.verti_subtitleName = verti_subtitleName;
        this.verti_titleview = verti_titleview;
        this.verti_titlerate = verti_titlerate;


        this.verti_imageLogo = verti_imageLogo;
    }


    public String getVerticalTitleName() {
        return verti_titleName;
    }

    public String getVerticalSubTitleName() {
        return verti_subtitleName;
    }

    public String getVerticalViewName() {
        return verti_titleview;
    }

    public String getVerticalRateName() {
        return verti_titlerate;
    }



    public int getVerticalImageLogo() {
        return verti_imageLogo;
    }
}
