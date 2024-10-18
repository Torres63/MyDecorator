package main.decorator;

public abstract class PersonDecorator implements Person{
    Person wrappee;

    protected PersonDecorator(Person person) {
        this.wrappee = person;
    }

    @Override
    public Long dmgReceived(Long damage){
        return wrappee.dmgReceived(damage);
    }

}
