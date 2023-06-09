package rikkei.academy.service.serviceIpm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.academy.model.RoleName;
import rikkei.academy.model.Roles;
import rikkei.academy.repository.IRoleRepository;
import rikkei.academy.service.IRoleService;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;
    @Override
    public List<Roles> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public boolean save(Roles roles) {
        Roles r=  roleRepository.save(roles);
       return true;
    }

    @Override
    public boolean deleteById(Long id) {
        roleRepository.deleteById(id);
        return true;
    }

    @Override
    public Roles findByRoleName(RoleName roleName) {
        return roleRepository.findByRoleName(roleName).get();
    }

    @Override
    public Roles findById(Long id) {
        return roleRepository.findById(id).get();
    }
}
