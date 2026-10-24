package ma.ensias.employee.service;

import ma.ensias.employee.entite.Employee;
import ma.ensias.employee.repository.EmployeeRepo;
import ma.ensias.employee.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private ModelMapper mapper;

    public EmployeeResponse getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if (employee.isPresent()) {
            return mapper.map(employee.get(), EmployeeResponse.class);
        }
        return null; // Or throw an exception if you prefer
    }
}