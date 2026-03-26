package BaoLong.example.docker.repository;

import BaoLong.example.docker.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}