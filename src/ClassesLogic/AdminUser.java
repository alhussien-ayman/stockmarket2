package ClassesLogic;

// AdminUser.java
public class AdminUser extends User {
    private String adminRole;

    public AdminUser(String username, String email, String adminRole) {
        super(username, email, adminRole, adminRole, balance);
        this.adminRole = adminRole;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    public void manageStocks() {
        // Method specific to admin user for managing stocks
        System.out.println("Admin user managing stocks...");
    }

    public void deleteUser(RegularUser user) {
        Users.remove(user);
        System.out.println("Deleted successfully");
    }

    public void updateUser(RegularUser updatedUser) {
        setUsername(updatedUser.getUsername());
        setEmail(updatedUser.getEmail());
        setPassword(updatedUser.getPassword());
        setFullName(updatedUser.getFullName());
        setBalance(updatedUser.getBalance());
    }

    public void retrieveUser(RegularUser user) {
        Users.get(user);
    }
}