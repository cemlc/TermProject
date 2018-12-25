package tr.edu.ieu.se360;

public class Unstructured {

    private String diagnosis;
    private String idl;
    private String localization;
    private String site;

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getIdl() {
        return idl;
    }

    public void setIdl(String idl) {
        this.idl = idl;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String toString() {
        return "Diagnosis : " + getDiagnosis() +
                "\nIDL : " + getIdl() +
                "\nLocalization :  " + getLocalization()+
                "\nSite : " + getSite();
    }
}
