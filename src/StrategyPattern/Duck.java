package StrategyPattern;

import StrategyPattern.FlyBehavior.FlyBehavior;
import StrategyPattern.QuackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All docks float, even decoys!");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
