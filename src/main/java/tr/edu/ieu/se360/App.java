package tr.edu.ieu.se360;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    static final File dirJson = new File("src/main/resources/merged_file.json");
    static final File dirJsonTest = new File("src/main/resources/merged_file_TEST.json");

    public static void main(String[] args) throws Exception{



        Gson gson = new Gson();

        Type jsonModelListType = new TypeToken<ArrayList<JsonModel>>(){}.getType();
        List<JsonModel> jsonModelList = gson.fromJson(new FileReader(dirJsonTest),jsonModelListType);

        ArrayList<JsonModel> resultFilter = new ArrayList<JsonModel>();

        Filter myFilter = new Filter();

        myFilter.maxMinAge(jsonModelList,resultFilter,0,100);

        myFilter.showResult(resultFilter);







    }

}
