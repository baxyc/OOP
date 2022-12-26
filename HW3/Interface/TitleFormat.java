package HW3.Interface;

import HW3.Items.Person;

public interface TitleFormat {
    public <T extends Person> String createString(T person);
}
