package tr.edu.ieu.se360;

public class Dataset {
    private float _accessLevel;
    private String _id;
    private String description;
    private String license;
    private String name;
    private String updated;

    public float get_accessLevel() {
        return _accessLevel;
    }

    public void set_accessLevel(float _accessLevel) {
        this._accessLevel = _accessLevel;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String toString() {
        return "Access Level : " + get_accessLevel() +
                "\nID: " + get_id() +
                "\nDescription :  " + getDescription()+
                "\nLicense : " + getLicense() +
                "\nName : " + getName() +
                "\nUpdated : " + getUpdated();
    }
}
