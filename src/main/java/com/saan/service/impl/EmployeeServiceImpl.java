package com.saan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saan.model.Employee;
import com.saan.repository.EmployeeRepository;
import com.saan.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    @Transactional
    public Employee save(Employee employee) {

        employee.getAddress().forEach(x -> x.setEmployee(employee));
        employee.getTechnology().forEach(x -> x.setEmployee(employee));
        return repository.save(employee);

    }

    @Override
    public Employee update(Employee entity) {

        return null;
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();

    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteInBatch(List<Employee> entities) {
        repository.deleteInBatch(entities);
    }

    @Override
    public Optional<Employee> findById(Long id) {

        return repository.findById(id);
    }

    @Override
    public List<Employee> findAll() {

        return repository.findAll();
    }

    @Override
    public long count() {

        return repository.count();
    }

}
