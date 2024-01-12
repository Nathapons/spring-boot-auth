package com.ltp.auth_basic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ltp.auth_basic.pojo.Contact;
import com.ltp.auth_basic.repository.ContactRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class AuthBasicApplication implements CommandLineRunner{

	ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuthBasicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		contactRepository.getContacts().add(new Contact("1", "Jon Snow", "6123456432"));
		contactRepository.getContacts().add(new Contact("2", "Tyrion Lannister", "3125466472"));
		contactRepository.getContacts().add(new Contact("3", "The Hound", "5126476532"));	
	}
}