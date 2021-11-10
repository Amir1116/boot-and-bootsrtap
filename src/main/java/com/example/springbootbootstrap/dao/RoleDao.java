package com.example.springbootbootstrap.dao;



import com.example.springbootbootstrap.model.Role;

import java.util.List;

public interface RoleDao {
    void save(Role role);
    List<Role> listRoles();
    void deleteRole(int id);
    Role getRole(int id);
    void updateRole(Role role);
    Role getRole(String name);
}
