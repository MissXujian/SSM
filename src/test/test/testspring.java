package test;

import com.itcast.dao.UserMapper;
import com.itcast.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testspring {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper bean = context.getBean(UserMapper.class);
        List<User> all = bean.findAll();
        System.out.println(all);


    }
}
