package android.example.esptoeng;

public class PhraseList {

//    creating two variables

    private String esp_phrase;
    private String eng_phrase;
    private int audio_phrase;

//    creating constructors for above variables


    public PhraseList(String esp_phrase, String eng_phrase, int audio_phrase) {
        this.esp_phrase = esp_phrase;
        this.eng_phrase = eng_phrase;
        this.audio_phrase = audio_phrase;
    }

//    getter and setter method for above variables


    public String getEsp_phrase() {
        return esp_phrase;
    }

    public void setEsp_phrase(String esp_phrase) {
        this.esp_phrase = esp_phrase;
    }

    public String getEng_phrase() {
        return eng_phrase;
    }

    public void setEng_phrase(String eng_phrase) {
        this.eng_phrase = eng_phrase;
    }

    public int getAudio_phrase() {
        return audio_phrase;
    }
}
