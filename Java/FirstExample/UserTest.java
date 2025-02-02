import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class UserTest {
    
    @Test()
    public void shouldReturnKidTypeWhenUserAgeIsOne() throws Exception {
        User user = new User(0, 1);
        assertEquals("child", User.getAgeType(user));
    }
}
