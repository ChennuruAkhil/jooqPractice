package com.akhil.poc.jooqPractice.controller;

import com.akhil.poc.jooqPractice.dto.AddressDto;
import com.akhil.poc.jooqPractice.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping("insert/address")
    public void addAddress(@RequestBody AddressDto addressDto){
        addressService.addAddress(addressDto);
    }
}
