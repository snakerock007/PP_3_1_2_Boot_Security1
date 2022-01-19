package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleService {

    void setRoleRepo(RoleDao roleDao);

    Role getRoleByName(String name);

    Role getRoleById(Long id);

    List<Role> allRoles();

    Role getDefaultRole();
}
