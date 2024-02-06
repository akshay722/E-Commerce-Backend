package com.aksh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aksh.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
