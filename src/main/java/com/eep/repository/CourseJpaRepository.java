package com.eep.repository;

import com.eep.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository ("courseJpaRepository")
public interface CourseJpaRepository extends JpaRepository<Course, Serializable> {
    public abstract Course findByPrecio(int precio);
    public abstract Course findByPrecioAndNombre( int precio, String nombre);
    public abstract List<Course> findByNombreOrderByHoras (String name);
    public abstract Course findByNombreOrPrecio(String nombre, int precio);
}
