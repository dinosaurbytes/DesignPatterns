package StrategyPattern;

import StrategyPattern.FlyBehavior.FlyWithWings;
import StrategyPattern.QuackBehavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I'm a real Mallard Duck");
    }
}
