package com.ltp.auth_basic.repository;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.ltp.auth_basic.pojo.Contact;

@Repository
public class ContactRepository {
    private List<Contact> contacts = new ArrayList<>();

    public Contact getContact(int id) {
        return contacts.get(id);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(int index) {
        contacts.remove(index);
    }
}
