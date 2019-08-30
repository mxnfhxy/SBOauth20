package com.rszdm.spbtmbtsswg.repo;

import com.rszdm.spbtmbtsswg.entity.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends CrudRepository<Permission, Integer> {
}
