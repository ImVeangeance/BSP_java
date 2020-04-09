public abstract class base_parent_user_class {
    private String name;
    private String email;

    public base_parent_user_class(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public base_parent_user_class() {}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public abstract String toString();
}