package tr.edu.ieu.se360;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    JsonModel myModelJson;
    image myImage;


    public void maxMinAge(List<JsonModel> myAgeList, ArrayList<JsonModel> myFilter, int min, int max){
        for(int i = 0; i<myAgeList.size(); i++){
            if (myAgeList.get(i).getMeta().getClinical().getAge_approx()>=min && myAgeList.get(i).getMeta().getClinical().getAge_approx()<=max){
                myFilter.add(myAgeList.get(i));

            }
        }
    }
    public static void showResult(ArrayList<JsonModel> myFilter){
        for(int i = 0; i<myFilter.size(); i++){
            System.out.println(myFilter.get(i).getName());
        }
        myFilter.clear();
    }


    public JsonModel getMyModelJson() {
        return myModelJson;
    }

    public void setMyModelJson(JsonModel myModelJson) {
        this.myModelJson = myModelJson;
    }

    public image getMyImage() {
        return myImage;
    }

    public void setMyImage(image myImage) {
        this.myImage = myImage;
    }
}
