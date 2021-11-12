package com.bieggerm.callcheck.data.repository;

import com.bieggerm.callcheck.data.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
}
