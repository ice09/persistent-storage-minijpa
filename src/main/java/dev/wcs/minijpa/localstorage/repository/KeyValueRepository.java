package dev.wcs.minijpa.localstorage.repository;

import dev.wcs.minijpa.localstorage.entity.KeyValueEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyValueRepository extends CrudRepository<KeyValueEntity, Long> {

}
