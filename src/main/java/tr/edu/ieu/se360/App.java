package tr.edu.ieu.se360;

import com.google.gson.Gson;

import java.io.FileReader;

public class App {

    public static void main(String[] args) throws Exception{

        Gson gson = new Gson();

        JsonModel myJsonModel = gson.fromJson(new FileReader("/Users/diderot/IdeaProjects/TermProject/src/main/resources/deneme2.json"),JsonModel.class);
        System.out.println(gson.toJson(myJsonModel));

        System.out.println(myJsonModel.getMeta().toStringClinical());


    }
}
