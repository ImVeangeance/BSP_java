public class developer_class extends base_parent_user_class implements csv, Comparable <developer_class> {
    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String level) {
        this.lang = level;
    }
    public developer_class(String name, String email, String lang) {
        super(name, email);
        this.lang = lang;
    }

    public developer_class() {}

    @Override
    public String toCSV() {
        return getName() + ',' + getEmail() + ',' + getLang();
    }

    @Override
    public void fromCSV(String str) {
        var data = str.split(",");
        setName(data[0]);
        setEmail(data[1]);
        setLang(data[2]);
    }

    @Override
    public String toString() {
        return "Developer {" +
                " name = '" + getName() + '\'' +
                " email = '" + getEmail() + '\'' +
                " lang = '" + getLang() + '\'' +
                " }";
    }

    @Override
    public int compareTo(developer_class obj) {
        return this.getEmail().compareTo(obj.getEmail());
    }
}