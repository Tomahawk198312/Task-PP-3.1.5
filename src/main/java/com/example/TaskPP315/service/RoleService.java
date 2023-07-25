package com.example.TaskPP315.service;

import com.example.TaskPP315.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    List<Role> findAllRole();

    Set<Role> findByIdRoles(List<Long>roles);

}