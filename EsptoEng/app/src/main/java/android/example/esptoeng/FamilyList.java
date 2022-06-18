package android.example.esptoeng;

public class FamilyList {

//    creating two variables

    private String esp_family;
    private String eng_family;

//    creating constructor for above two variables

    public FamilyList(String esp_family, String eng_family) {
        this.esp_family = esp_family;
        this.eng_family = eng_family;
    }

//    getter and setter methods for above two variables


    public String getEsp_family() {
        return esp_family;
    }

    public void setEsp_family(String esp_family) {
        this.esp_family = esp_family;
    }

    public String getEng_family() {
        return eng_family;
    }

    public void setEng_family(String eng_family) {
        this.eng_family = eng_family;
    }
}
