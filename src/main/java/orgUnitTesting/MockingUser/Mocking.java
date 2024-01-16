package orgUnitTesting.MockingUser;

public class Mocking {

    User user;

    public void setUser(User user) {
        this.user = getUser(user);
    }

    private User getUser(User user) {
        return user;
    }

    public int assignPermission() {
        if(user.getRole().equals("admin")) {
            String username = user.getUsername();
            System.out.println("Assign special permissions for user " + username);
            return 1;
        } else {
            System.out.println("Cannot assign permission");
            return -1;
        }
    }


}
