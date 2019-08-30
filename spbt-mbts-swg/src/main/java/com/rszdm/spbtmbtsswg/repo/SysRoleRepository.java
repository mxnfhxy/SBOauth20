package com.rszdm.spbtmbtsswg.repo;

import com.rszdm.spbtmbtsswg.entity.SysRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleRepository extends CrudRepository<SysRole,Integer> {
}
