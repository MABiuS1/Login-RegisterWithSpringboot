package th.mfu.weather.Service;

import th.mfu.weather.DTO.EmployeeDTO;
import th.mfu.weather.DTO.LoginDTO;
import th.mfu.weather.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginResponse loginEmployee(LoginDTO loginDTO);
}