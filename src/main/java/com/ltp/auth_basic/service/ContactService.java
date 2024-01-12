package com.ltp.auth_basic.service;

import java.util.List;

import com.ltp.auth_basic.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id);
    void saveContact(Contact contact);
    List<Contact> getContacts();
    void deleteContact(String id);
}
