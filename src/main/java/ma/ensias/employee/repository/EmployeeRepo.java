package ma.ensias.employee.repository;

import ma.ensias.employee.entite.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {}