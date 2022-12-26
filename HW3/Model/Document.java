package HW3.Model;

import HW3.Interface.TitleFormat;
import HW3.Items.Person;

public class  Document <T extends Person>{
    TitleFormat format;
    String text;
    String path;
   
    T person;

    public Document(T person){
        this.person = person;
    }

    public void setFormat(TitleFormat format) {
        this.format = format;
    }
    public void setPath(String path){
        this.path = path;
    }

  
    public <T extends Person> void save(){
        text = format.createString(person);
        Model.saveFile(text, this.path);

    }

}
