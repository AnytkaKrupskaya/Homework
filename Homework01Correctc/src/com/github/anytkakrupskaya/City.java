package com.github.anytkakrupskaya; 

/** 
* Created by Аня on 19.03.2016. 
*/ 
public class City { 
protected String name ; 
protected int area ; 
protected String mayor ; 
protected int numberOfResidents ; 
protected int coordinates ; 

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

public void setCoordinates (int coordinates) { 
this. coordinates = coordinates; 
} 

public String toString() { 
return "About city \nName: " + this.name + "\n area: " + this.area + "\n mayor: " + this.mayor + "\n number of residents: " + this.numberOfResidents + "\n coordinates: " + this.coordinates; 

} 

}
