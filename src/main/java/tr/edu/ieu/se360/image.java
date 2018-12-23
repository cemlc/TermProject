package tr.edu.ieu.se360;

import java.util.ArrayList;

public class image {
    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    JsonModel jsonImageName;



    public JsonModel getJsonImageName() {
        return jsonImageName;
    }

    public void setJsonImageName(JsonModel jsonImageName) {
        this.jsonImageName = jsonImageName;
    }
    public void matchJson(ArrayList<image> myImage, ArrayList<JsonModel> jsImage){
        for(int i = 0; i<jsImage.size(); i++){
            myImage.get(i).setImagePath(jsImage.get(i).getName());
            System.out.println(myImage.get(i).getJsonImageName());
        }
    }


    public String jpegPath(){
        return "/Users/diderot/IdeaProjects/TermProject/src/main/resources/imageJPEG/"+getJsonImageName().getName()+".jpeg";
    }
}
