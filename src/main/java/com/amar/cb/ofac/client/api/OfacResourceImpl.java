package com.amar.cb.ofac.client.api;

import com.amar.cb.ofac.client.model.Customer;
import com.amar.cb.ofac.client.model.CustomerBo;
import com.amar.cb.ofac.client.model.CustomerDto;
import com.amar.cb.ofac.client.service.OfacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfacResourceImpl {

    @Autowired
    private OfacService ofacService;

    @RequestMapping(value = "/ofac/customer/screen", method = RequestMethod.POST)
    public ResponseEntity<String> screen(@RequestBody CustomerDto customerDto) {
        Customer customerBo = new CustomerBo(customerDto.getName(), customerDto.getDob());
        return new ResponseEntity<String>(ofacService.screen(customerBo), HttpStatus.OK);
    }

}
