package com.kranti.springcore.date;

import java.util.Date;

public class InitializeCurrentDate {
	
	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	private Date currentDate = null;
	
	public void getTodaysDate() {
		switch(this.currentDate.getDay()) {
		case 0 :
			System.out.println("Its Sunday !"+ " and " +(this.currentDate.getMonth()+1) + "/" + 
		(this.currentDate.getDate()) +"/" + (this.currentDate.getYear()+1900));
			break;
		case 1 :
			System.out.println("Its Monday !"+ " and " +(this.currentDate.getMonth()+1) + "/" + 
		(this.currentDate.getDate()) +"/" + (this.currentDate.getYear()+1900));
			break;
		case 2 :
			System.out.println("Its Tuesday !"+ " and " +(this.currentDate.getMonth()+1) + "/" + 
		(this.currentDate.getDate()) +"/" + (this.currentDate.getYear()+1900));
			break;
		case 3 :
			System.out.println("Its Wednesday !"+ " and " +(this.currentDate.getMonth()+1) + "/" + 
		(this.currentDate.getDate()) +"/" + (this.currentDate.getYear()+1900));
			break;
		case 4 :
			System.out.println("Its Thursday !"+ " and " +(this.currentDate.getMonth()+1) + "/" + 
		(this.currentDate.getDate()) +"/" + (this.currentDate.getYear()+1900));
			break;
		case 5 :
			System.out.println("Its Friday !"+ " and " +(this.currentDate.getMonth()+1) + "/" + 
		(this.currentDate.getDate()) +"/" + (this.currentDate.getYear()+1900));
			break;
		case 6 :
			System.out.println("Its Saturday !"+ " and " +(this.currentDate.getMonth()+1) + "/" + 
		(this.currentDate.getDate()) +"/" + (this.currentDate.getYear()+1900));
		}
	}

}
