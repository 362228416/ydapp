package repository;

import hello.Application;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author: john
 * @version: 1.0 2014-05-30 21:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserRepositoryTest {


    @Qualifier("userRepository")
    @Autowired
    private UserRepository repository;
    
    @Test
    public void testSave() throws Exception {
        User user = new User();
        user.setLoginno("12345");
        user.setLoginpwd("45678");
        user = repository.save(user);
        repository.delete(user.getId());
    }


}
