package com.divagar.springapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.divagar.springapp.Entity.student;
@Repository
public interface studentRepository extends JpaRepository<student,Long>
{

}
