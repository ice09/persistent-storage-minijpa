package dev.wcs.minijpa.localstorage;

import dev.wcs.minijpa.localstorage.entity.KeyValueEntity;
import dev.wcs.minijpa.localstorage.repository.KeyValueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalStorageApplication implements CommandLineRunner {

	private final KeyValueRepository keyValueRepository;

	public LocalStorageApplication(KeyValueRepository keyValueRepository) {
		this.keyValueRepository = keyValueRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		KeyValueEntity kv = new KeyValueEntity();
		kv.setKey("key");
		kv.setValue("value");
		keyValueRepository.save(kv);
		System.out.println(keyValueRepository.findAll());
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalStorageApplication.class, args);
	}

}
