package prosky.homework209.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import prosky.homework209.model.Employee;
@ResponseStatus (code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(){
        super("Сотрудник не найден");

    }
  public EmployeeNotFoundException(Employee employee) {
     super("Сотрудник не найден "  +  employee.toString());

  }




}
