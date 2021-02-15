public class CarManager{

    private final Integer ARRAY_MAX_LIMIT = 50;
    private int index;
    private Car[] cars;

    public CarManager(){
        this.cars = new Car[ARRAY_MAX_LIMIT];
        this.index = 0;
    }

    public void addCar(Car newCar){
        if(index < ARRAY_MAX_LIMIT){
            this.cars[index] = newCar;
            index++;
        }
    }

    public void removeCar(){
        index--;
        cars[index] = null;
    }

    public void list(){
        int i = 0;
        while(i < ARRAY_MAX_LIMIT){
            if(cars[i] != null){
                System.out.println(cars[i].getModel() + " - " + cars[i].getLicense());
            }
            i++;
        }
    }

    public Car search(String license){
        int i = 0;
        while(i < ARRAY_MAX_LIMIT){
            if(cars[i] != null && license.equals(cars[i].getLicense())){
                return cars[i];
            }
            i++;
        }
        return null;
    }

    public void modify(String license, Car newCarValues){
        Car targetCar = this.search(license);
        if(targetCar != null){
            targetCar.setLicense(newCarValues.getLicense());
            targetCar.setModel(newCarValues.getModel());
        }
    }
}
