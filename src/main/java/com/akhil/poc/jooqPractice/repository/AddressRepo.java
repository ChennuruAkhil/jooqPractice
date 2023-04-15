package com.akhil.poc.jooqPractice.repository;

import com.akhil.poc.jooqPractice.dto.AddressDto;
import static com.akhil.poc.jooqPractice.jooqTables.tables.Address.ADDRESS;
import lombok.AllArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AddressRepo {

    private final DSLContext dslContext;

    public void addAddress(AddressDto addressDto){
        dslContext.insertInto(ADDRESS).set(ADDRESS.CITY,addressDto.getCity())
                .set(ADDRESS.STATE,addressDto.getState())
                .set(ADDRESS.STREET,addressDto.getStreet()).execute();
    }
}
