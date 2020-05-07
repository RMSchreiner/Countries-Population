package Countries;

import java.util.ArrayList;

public class CountriesLineConverter implements LineConverter<Countries>{
	
	// {
	public String toLine(Countries object) {	
		
	//@Override	
		// return object attributes separated with a delimeter
		return object.getCountries()+","+object.getPop();
	}

	//@override
	public Countries fromLine(String line) {
		
		// delimeter separates object's attributes
		String[] parts = line.split(",");
		String countries = parts[0];
		int pop = Integer.parseInt(parts[1]);
		
		
		return new Countries(countries, pop);
	}

}

