package android.example.esptoeng;


public class NumberList {

//    creating two variables

    private int num_image;
    private String esp_number;
    private String eng_number;

//    constructor of two variables created above

    public NumberList(int num_image, String esp_number, String eng_number) {
        this.num_image = num_image;
        this.esp_number = esp_number;
        this.eng_number = eng_number;
    }

//    getter and setter method for two upper created variables


    public int getNum_image() {
        return num_image;
    }

    public String getEsp_number() {
        return esp_number;
    }

    public void setEsp_number(String esp_number) {
        this.esp_number = esp_number;
    }

    public String getEng_number() {
        return eng_number;
    }

    public void setEng_number(String eng_number) {
        this.eng_number = eng_number;
    }
}
