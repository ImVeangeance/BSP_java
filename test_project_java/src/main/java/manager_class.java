public class manager_class extends base_parent_user_class implements csv {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public manager_class(String name, String email, String position) {
        super(name, email);
        this.position = position;
    }

    public manager_class() {}

    @Override
    public String toCSV() {
        return getName() + ',' + getEmail() + ',' + getPosition();
    }

    @Override
    public void fromCSV(String str) {
        var data = str.split(",");
        setName(data[0]);
        setEmail(data[1]);
        setPosition(data[2]);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                "email='" + getEmail() + '\'' +
                "position='" + getPosition() + '\'' +
                '}';
    }
}
