/**
 * \* Created with IntelliJ IDEA.
 * \* Author: Prekrasnov Sergei
 * \* Date: 19.04.2022
 * \*  ----- group JAVA-27 -----
 * \* Description: Домашнее задание к занятию 1.2: Структурные шаблоны. Adapter, Proxy, Decorator, Facade, Flyweight
 * \    Задача Калькулятор
 */
public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}
