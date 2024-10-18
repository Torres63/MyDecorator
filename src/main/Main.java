package main;

import main.decorator.BasicPerson;
import main.decorator.PersonDecorator;
import main.decorator.armour.BodyArmourDecorator;
import main.decorator.armour.HelmetDecorator;

public class Main {
    public static void main(String[] args) {
        PersonDecorator personDecorator = new HelmetDecorator(new BodyArmourDecorator(new BasicPerson()));
        Long damage = personDecorator.dmgReceived(100L);
        System.out.println(damage);

    }
}