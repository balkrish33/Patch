package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>
{
	private String name;
	private double rating;
	private int year;
	
	
	@Override
	public int compareTo(Movie m) {
		
		return this.year-m.year;
	}
	public Movie(String name,double rating, int year)
	{
	 this.name=name;
	 this.rating=rating;
	 this.year=year;
	}

	
	
	
	
	public String getName() {
		return name;
	}
	/*public void setMovieName(String movieName) {
		name = movieName;
	}*/
	public double getRating() {
		return rating;
	}
	/*public void setRating(double rating) {
		this.rating = rating;
	}
	*/public int getYear() {
		return year;
	}
	/*public void setYear(int year) {
		this.year = year;
	}
	
*/	
	
}
public class ComparableDemo {
public static void main(String[] args) {
	
	ArrayList<Movie> list=new ArrayList<Movie>();
	list.add(new Movie("love",3.6,2015));
	list.add(new Movie("Premalayam",3.2,2014));
	list.add(new Movie("krishnagadiveera  premagadha",3.6,2016));
	list.add(new Movie("nenu kori",2.6,2013));
	
	Collections.sort(list);
	System.out.println("Movies after sorting :: ");
	for(Movie m:list)
	{
		System.out.println(m.getName() + " "+m.getRating()+ "  "+m.getYear());
	}
	
}
}
