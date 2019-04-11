package StrategyPattern;

import StrategyPattern.FlyBehavior.FlyBehavior;
import StrategyPattern.FlyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        ((MallardDuck) mallardDuck).display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        System.out.println();

        Duck rubberDuck = new RubberDuck();
        ((RubberDuck) rubberDuck).display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();

        System.out.println();

        Duck modelDuck = new ModelDuck();
        ((ModelDuck) modelDuck).display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.swim();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
