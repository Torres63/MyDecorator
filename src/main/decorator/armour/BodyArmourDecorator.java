package main.decorator.armour;

import main.decorator.Person;
import main.decorator.PersonDecorator;

public class BodyArmourDecorator extends PersonDecorator {

    public BodyArmourDecorator(Person person) {
        super(person);
    }

    @Override
    public Long dmgReceived(Long damage){
        return super.dmgReceived(damage) / 4;
    }
}
