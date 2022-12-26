package HW3.Model;


import HW3.Interface.TitleFormat;
import HW3.Items.Person;

public class JsonFormat implements TitleFormat{

    @Override
    public <T extends Person> String  createString(T person) {
        return String.format("{\n" +
                                "\"worker\" : {\n" +
                                "\"age\":%d,\n" +
                                "\"Firstname\":%s,\n" +
                                "\"Surname\":%s,\n" +
                                "}\n" +
                                "};", person.getAge(), person.getFirstname(), person.getSurname());
    }          
}
