package Model;

import java.io.File;
import java.util.ArrayList;

public class Model {
    String saveLocation;
    String searchLocation;

    public Model(String saveLocation, String searchLocation) {
        this.saveLocation = saveLocation;
        this.searchLocation = searchLocation;
    }


    public ArrayList<String> findAllFiles(){
        ArrayList foundFiles = new ArrayList();
        return foundFiles;
    }

    /**
     * searches for all non folders
     * @param folder
     * @return
     */
    public File searchFolder(File folder){
        if(folder.isDirectory()){
            searchFolder(folder);
        }
        return folder;
    }

}
