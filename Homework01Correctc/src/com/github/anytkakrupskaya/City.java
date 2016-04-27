package com.github.anytkakrupskaya; 

/** 
* Created by Аня on 19.03.2016. 
*/ 
public class City { 
    protected String name; 
    protected int area; 
    protected String mayor ; 
    protected int numberOfResidents; 
    protected double latitude;
    protected double longitude;
    

    public void setName(String name) { 
        this.name = name; 
    } 
    public String getName() {return name;} 

    public void setArea (int area) { 
        this.area = area; 
    } 
    public int getArea() {return area;} 

    public void setMayor (String mayor) { 
        this.mayor = mayor; 
    } 
    public String getMayor() {return mayor;} 

    public void setNumberOfResidents (int numberOfResidents) { 
        this.numberOfResidents = numberOfResidents; 
    } 
    public int getNumberOfResidents() {return numberOfResidents;} 

    public void setLatitude (double latitude) { 
        this.latitude; 
    } 
    
     public void setLongitude (double longitude) { 
        this.longitude = longitude; 
    } 
    
    
   public City (String name, int area, String mayor, int numberOfResidents, double latitude, double longitude ) { 
        this.name = name; 
        this.area=area; 
        this.mayor=mayor ; 
        this.numberOfResidents=numberOfResidents; 
        this.latitude=atitude ; 
        this.longitude = longitude;
   }
   
    public String toString() { 
        return "About city \nName: " + this.name + "\n area: " + this.area + "\n mayor: " + this.mayor + "\n number of residents: " + this.numberOfResidents + "\n latitude: " + this.latitude + "\n longitudes: " + this.longitude; 
    } 

}
