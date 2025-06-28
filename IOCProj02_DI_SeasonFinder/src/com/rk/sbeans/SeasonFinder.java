package com.rk.sbeans;

import java.time.LocalDate;

public class SeasonFinder 
{
	private LocalDate date;
	
	public void setDate(LocalDate date)
	{
		this.date= date;
	}
	
	public String showSeason()
	{
		int month= date.getMonthValue();
		if(month >= 3 && month <=5)
			return "Spring Season";
		else if(month >= 6 && month <=8)
			return "Summer Season";
		else if(month >= 9 && month <=11)
			return "Rainy Season";
		else
			return "Winter Season";
	}
}
