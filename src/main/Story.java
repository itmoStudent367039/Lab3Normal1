package main;

import abstracts.*;
import subjects.*;

public class Story {
    public static void main(String[] args) {
        CelestialBody body = new Moon("Луна", AccelerationOfGravity.MOONGRAVITY);
        Location inTransport = new InToTheTransport("Около транспорта", body);
        Location landingPlace = new LandingSite("Место приземления", body);
        Hero znaika = new Human("Знайка", inTransport, new Point(0, 0), 40);
        Hero kubik = new Human("Кубик", inTransport, new Point(0, 0), 45);
        Hero tubik = new Human("Тюбик", inTransport, new Point(0, 0), 42);
        Hero zvezdochkin = new Human("Звездочкин", inTransport, new Point(0, 0), 47);
        Hero steklyashkin = new Human("Стекляшкин", inTransport, new Point(0, 0), 39);
        Hero klepka = new Human("Клепка", inTransport, new Point(0, 0), 35);
        Transport transport = new Rocket("Ракета", new Point(0, 0), landingPlace, znaika, kubik, tubik, zvezdochkin, steklyashkin, klepka);
        Location closeToTransport = new NextToTransport("Около ракеты", body);
        transport.subPassenger(znaika);
        znaika.setLocation(closeToTransport);
        Location onRoad = new Road("Дорога", body, 100);
        znaika.setLocation(onRoad);
        znaika.go();
        transport.subPassenger(kubik);
        transport.subPassenger(tubik);
        transport.subPassenger(zvezdochkin);
        transport.subPassenger(steklyashkin);
        kubik.setLocation(closeToTransport);
        tubik.setLocation(closeToTransport);
        zvezdochkin.setLocation(closeToTransport);
        steklyashkin.setLocation(closeToTransport);
        kubik.setLocation(onRoad);
        tubik.setLocation(onRoad);
        zvezdochkin.setLocation(onRoad);
        steklyashkin.setLocation(onRoad);
        kubik.go();
        tubik.go();
        zvezdochkin.go();
        steklyashkin.go();
        transport.subPassenger(klepka);
        klepka.setLocation(closeToTransport);
        klepka.jump();
        klepka.setLocation(onRoad);
        klepka.goWithJumps();
        znaika.see(klepka);
        znaika.thinkAbout(klepka);
        znaika.toOrder(klepka);
        klepka.abey(znaika);
    }
}
