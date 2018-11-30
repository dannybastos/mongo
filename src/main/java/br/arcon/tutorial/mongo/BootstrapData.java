package br.arcon.tutorial.mongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

	private PersonRepository personRepository;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	public BootstrapData(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		log.info("loading data...");
		Person person = new Person();
		person.setFistName("aurora");
		person.setLastName("aurora");
		person.setAge(1);
		personRepository.save(person);
		log.info("data loaded.!");
	}
}
