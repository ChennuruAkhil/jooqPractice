package com.akhil.poc.jooqPractice.service;

import com.akhil.poc.jooqPractice.dto.AddressDto;
import com.akhil.poc.jooqPractice.repository.AddressRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressService {

    private final AddressRepo addressRepo;

    public void addAddress(AddressDto addressDto){
        addressRepo.addAddress(addressDto);
    }


}
