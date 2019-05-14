package cn.itsource.jiacheng.service;

import cn.itsource.aigou.domain.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IEmployeeService extends IService<Employee> {

    Employee login(String username, String password);
}
