package com.amar.cb.ofac.client.service;

import com.amar.cb.ofac.client.model.Customer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Component
public class OfacServiceImpl implements OfacService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "reliable")
    @Override
    public String screen(Customer customerBo) {
        System.out.println("Screening customer: " + customerBo);
        HttpEntity<Customer> request = new HttpEntity<>(customerBo);
        String status = restTemplate.postForObject("http://localhost:8081/prime/customer/screen",
                        request, String.class);
        System.out.println("Response Received as " + status + " -  " + new Date());

        return status;
    }


    public String reliable(Customer customerBo) {
        return "Please try after sometime";
    }
}
