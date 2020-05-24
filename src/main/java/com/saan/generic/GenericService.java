package com.saan.generic;

import java.util.List;
import java.util.Optional;

public interface GenericService<T extends Object> {

    public T save(T entity);

    public T update(T entity);

    public void deleteAll();

    public void deleteById(Long id);

    public void deleteInBatch(List<T> entities);

    public Optional<T> findById(Long id);

    public List<T> findAll();

    public long count();
}
