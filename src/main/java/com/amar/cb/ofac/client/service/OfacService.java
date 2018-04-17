package com.amar.cb.ofac.client.service;

import com.amar.cb.ofac.client.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface OfacService {

    public String screen(Customer customer);
}
