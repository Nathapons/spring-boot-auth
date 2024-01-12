package com.ltp.auth_basic.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ltp.auth_basic.pojo.Contact;
import com.ltp.auth_basic.service.ContactService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ContactController {
    
    @Autowired
    private ContactService contactService;
    

    @GetMapping("/contacts")
    public ResponseEntity<List<Contact>> getContacts() {
        return new ResponseEntity<>(contactService.getContacts(), HttpStatus.OK);
    }
    
    @GetMapping("/contact/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable String id) {
        return new ResponseEntity<>(contactService.getContactById(id), HttpStatus.OK);
    }

    @PostMapping("/contact")
    public ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) {
        contactService.saveContact(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @DeleteMapping("/contact/{id}")
    public ResponseEntity<HttpStatus> deleteContact(@PathVariable String id) {
        contactService.deleteContact(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
