package orgUnitTesting.MockingUser;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockingTest {

    Mocking mocking;

    @BeforeEach
    public void setup() {
        mocking = new Mocking();
    }

    @Test
    @DisplayName("Permission assigned successfully")
    public void assignPermissions() {

        User user = mock(User.class);
        mocking.setUser(user);
        when(user.getRole()).thenReturn("admin");
        when(user.getUsername()).thenReturn("Sumonta");
        Assertions.assertEquals(1, mocking.assignPermission());

    }

}
