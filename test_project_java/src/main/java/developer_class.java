public class developer_class extends base_parent_user_class implements csv {
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public developer_class(String name, String email, String level) {
        super(name, email);
        this.level = level;
    }

    public developer_class() {}

    @Override
    public String toCSV() {
        return getName() + ',' + getEmail() + ',' + getLevel();
    }

    @Override
    public void fromCSV(String str) {
        var data = str.split(",");
        setName(data[0]);
        setEmail(data[1]);
        setLevel(data[2]);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                "email='" + getEmail() + '\'' +
                "lang='" + getLevel() + '\'' +
                '}';
    }
}