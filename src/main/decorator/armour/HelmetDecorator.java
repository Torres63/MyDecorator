package main.decorator.armour;

import main.decorator.Person;
import main.decorator.PersonDecorator;

public class HelmetDecorator extends PersonDecorator {
    public HelmetDecorator(Person person) {
        super(person);
    }

    @Override
    public Long dmgReceived(Long dmg) {
        return super.dmgReceived(dmg) / 2;
    }

}
