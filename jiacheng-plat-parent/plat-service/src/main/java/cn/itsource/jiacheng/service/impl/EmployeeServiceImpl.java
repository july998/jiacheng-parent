package cn.itsource.jiacheng.service.impl;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.jiacheng.mapper.EmployeeMapper;
import cn.itsource.jiacheng.service.IEmployeeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.function.Supplier;

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements IEmployeeService{

    @Override
    public Employee login(String username, String password) {

        //QueryWrapper<Employee> wrapper = new QueryWrapper<>();
        //wrapper.eq("username",username).eq("password",password);
        //return baseMapper.selectOne(wrapper);
        return baseMapper.selectOne(new QueryWrapper<Employee>()
                .eq("username",username)
                .eq("password",password));
    }
}
