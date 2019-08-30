package com.rszdm.spbtmbtsswg.service.impl;

import com.rszdm.spbtmbtsswg.entity.Permission;
import com.rszdm.spbtmbtsswg.entity.SysUser;
import com.rszdm.spbtmbtsswg.repo.SysUserRepository;
import com.rszdm.spbtmbtsswg.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    SysUserRepository sysUserRepository;
    @Autowired
    PermissionService permissionService;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserRepository.getUserByName(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (sysUser != null) {
            System.err.println("sysUser===============" + sysUser);
            //获取用户的授权
            List<Permission> permissions = permissionService.findByAdminUserId(sysUser.getId());
            //声明授权文件
            for (Permission permission : permissions) {
                if (permission != null && permission.getName() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_"+permission.getName());
                    grantedAuthorities.add(grantedAuthority);
                }
            }
        }
        System.err.println("grantedAuthorities===============" + grantedAuthorities);
        return new User(sysUser.getName(), sysUser.getPassword(), grantedAuthorities);
    }


}
