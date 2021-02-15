public class CarManager{

    private final Integer ARRAY_MAX_LIMIT = 50;
    private Car[] cars;

    public CarManager(){
        this.cars = new Car[ARRAY_MAX_LIMIT];
    }

    public void addCar(Car newCar){
        int index = getSize();
        if(index < ARRAY_MAX_LIMIT){
            this.cars[index] = newCar;
        }
    }

    // Borrado de coche vía valor de la clase (en este caso por la matrícula)
    public void removeCar(Car car){
        int i = 0;
        while(this.cars[i] != null && i < ARRAY_MAX_LIMIT){
            if(cars[i].equals(car)){
                cars[i] = null;
                break;
            }
            i++;
        }
    }

    // Borrado de coche vía índice.
    public void removeCar(int index){
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

    private int getSize(){
        int i = 0;
        int counter = 0;
        while(this.cars[i] != null && i < ARRAY_MAX_LIMIT){
            counter++;
            i++;
        }
        return counter;
    }
}

    
