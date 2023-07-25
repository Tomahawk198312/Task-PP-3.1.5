package com.example.TaskPP315.service;

import com.example.TaskPP315.model.Role;
import com.example.TaskPP315.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public Set<Role> findByIdRoles(List<Long> roles) {
        return new HashSet<>(roleRepository.findAllById(roles));
    }

}