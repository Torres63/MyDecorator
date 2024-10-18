package main.decorator;

public class BasicPerson implements Person{

    @Override
    public Long dmgReceived(Long dmg) {
        return dmg;
    }
}
