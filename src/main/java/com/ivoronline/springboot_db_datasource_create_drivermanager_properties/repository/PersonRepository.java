package com.ivoronline.springboot_db_datasource_create_drivermanager_properties.repository;

import com.ivoronline.springboot_db_datasource_create_drivermanager_properties.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
