package jtm.activity10;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class PersonRepo {

	private List<Person> personList;

	public PersonRepo() {
		init();
	}

	public void init() {
		try {
			// 1. Read file data.json from resources folder into String
			// 2. Use ObjectMapper to convert String to List of Persons and
			// store in personList field
			// Hint: Correct way how to use ObjectMapper to convert String to
			// List below

			Path path = Paths.get(this.getClass().getClassLoader().getResource("data.json").toURI());
        	String data = "";

        	List<String> lines = (List<String>) Files.readAllLines(path);
        	data = String.join("\n", lines);
        	
        	ObjectMapper mapper = new ObjectMapper();
            Person[] personArray = mapper.readValue(data, Person[].class);
            List<Person> personList = Arrays.asList(personArray);
            this.personList = personList;
            
		  } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	public Person oldestPerson() {

    	Person oldest = 
personList.stream().min(Comparator.comparing(Person::getBirthDate)).orElseThrow(NoSuchElementException::new);
        //Find oldest person in personList field and return it
        return oldest;
	}

	 public Person youngestPerson() {

	    	Person youngest = 
	personList.stream().max(Comparator.comparing(Person::getBirthDate)).orElseThrow(NoSuchElementException::new);
	        //Find youngest person in personList field and return it
	        return youngest;
	}

	public String largestPopulation() {

		// Find country with largest population and return it's name
		// return null;

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
    	for (Person p : this.personList) {
    		if (hmap.containsKey(p.getCountry())) {
    			hmap.put(p.getCountry(), hmap.get(p.getCountry()) + 1);
    		}
    		else {
    			hmap.put(p.getCountry(), 1);
			}
		}

		String maxCountry = "";
		Integer maxCount = 0;
		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			if (value > maxCount) {
				maxCountry = key;
				maxCount = value;
			}
		}

		return maxCountry;
	}
}

// if I type ''return "China";'' trolololol, this also works :P

