package com.company;

public class Holiday {

     String name;
     int month;
     int dayOfMonth;
     String description;
     boolean isFederal;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public boolean isFederal() {
        return isFederal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public void setFederal(boolean federal) {
        isFederal = federal;
    }

    public Holiday(String name, int month, int dayOfMonth, String description, boolean isFederal) {

        this.name = name;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.description = description;
        this.isFederal = isFederal;
    }

}
