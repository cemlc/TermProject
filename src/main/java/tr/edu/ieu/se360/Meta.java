package tr.edu.ieu.se360;

public class Meta {

    Acquisition acquisition;
    Clinical clinical;
    Unstructured unstructured;
    UnstructuredExif unstructuredExif;

    private class Acquisition {

        private String image_type;
        private float pixelsX;
        private float pixelsY;

        public String getImage_type() {
            return image_type;
        }

        public void setImage_type(String image_type) {
            this.image_type = image_type;
        }

        public float getPixelsX() {
            return pixelsX;
        }

        public void setPixelsX(float pixelsX) {
            this.pixelsX = pixelsX;
        }

        public float getPixelsY() {
            return pixelsY;
        }

        public void setPixelsY(float pixelsY) {
            this.pixelsY = pixelsY;
        }
    }

    private class Clinical {
        private int age_approx;
        private String anatom_site_general;
        private String benign_malignant;
        private String diagnosis;
        private String diagnosis_confirm_type = null;
        private boolean melanocytic;
        private String sex;

        public int getAge_approx() {
            return age_approx;
        }

        public void setAge_approx(int age_approx) {
            this.age_approx = age_approx;
        }

        public String getAnatom_site_general() {
            return anatom_site_general;
        }

        public void setAnatom_site_general(String anatom_site_general) {
            this.anatom_site_general = anatom_site_general;
        }

        public String getBenign_malignant() {
            return benign_malignant;
        }

        public void setBenign_malignant(String benign_malignant) {
            this.benign_malignant = benign_malignant;
        }

        public String getDiagnosis() {
            return diagnosis;
        }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        public String getDiagnosis_confirm_type() {
            return diagnosis_confirm_type;
        }

        public void setDiagnosis_confirm_type(String diagnosis_confirm_type) {
            this.diagnosis_confirm_type = diagnosis_confirm_type;
        }

        public boolean isMelanocytic() {
            return melanocytic;
        }

        public void setMelanocytic(boolean melanocytic) {
            this.melanocytic = melanocytic;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }


    }

    private class Unstructured {

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
    }

    private class UnstructuredExif {
    }

    public Acquisition getAcquisition() {
        return acquisition;
    }

    public void setAcquisition(Acquisition acquisition) {
        this.acquisition = acquisition;
    }

    public Clinical getClinical() {
        return clinical;
    }

    public void setClinical(Clinical clinical) {
        this.clinical = clinical;
    }

    public Unstructured getUnstructured() {
        return unstructured;
    }

    public void setUnstructured(Unstructured unstructured) {
        this.unstructured = unstructured;
    }

    public UnstructuredExif getUnstructuredExif() {
        return unstructuredExif;
    }

    public void setUnstructuredExif(UnstructuredExif unstructuredExif) {
        this.unstructuredExif = unstructuredExif;
    }

    public String toStringClinical() {
        return "Approximate Age : " + getClinical().getAge_approx() +
                "\nSex : " + getClinical().getSex() +
                "\nAnatom Site General :  " + getClinical().getAnatom_site_general()+
                "\n Benign Maligent : " + getClinical().getBenign_malignant() +
                "\nDiagnosis : " + getClinical().getDiagnosis() +
                "\nDiagnosis Confirm Type : " + getClinical().getDiagnosis_confirm_type() +
                "\nMelanocytic : " + getClinical().isMelanocytic();
    }
}
