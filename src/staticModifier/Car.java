package staticModifier;

public class Car {

    private String name;

    private String engine;


    public static int numberOfCars;


    public Car(String name,String engine){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }
    String getName(){
        return this.name;
    }
    void setName(String name1){
        name1=this.name;
    }
    void setEngine(String engine1){
        engine1=this.engine;
    }
    String getEngine(){
        return this.engine;

    }
}
