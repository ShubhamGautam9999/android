package android.example.esptoeng;

public class ColorList {

//    creating two variables

    private int color_Image;
    private String esp_color;
    private String eng_color;

//    creating constructors for above variables


    public ColorList(int color_Image, String esp_color, String eng_color) {
        this.color_Image = color_Image;
        this.esp_color = esp_color;
        this.eng_color = eng_color;
    }

//    getter and setter method for above variables


    public int getColor_Image() {
        return color_Image;
    }

    public String getEsp_color() {
        return esp_color;
    }

    public void setEsp_color(String esp_color) {
        this.esp_color = esp_color;
    }

    public String getEng_color() {
        return eng_color;
    }

    public void setEng_color(String eng_color) {
        this.eng_color = eng_color;
    }
}
