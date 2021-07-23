package com.backend.carsale.dao;

import com.backend.carsale.models.Inquiry;
import org.springframework.data.repository.CrudRepository;

public interface InquiryDao extends CrudRepository<Inquiry, Long> {
}
