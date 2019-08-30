package com.rszdm.spbtmbtsswg.service;

import com.rszdm.spbtmbtsswg.entity.Permission;

import java.util.List;

public interface PermissionService {

    public List<Permission> findAll();
    public List<Permission> findByAdminUserId(int userId);

}
