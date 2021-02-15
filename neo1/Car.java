public class Car{
    private String license;
    private String model;

    public Car(){
    }

    public Car(String license, String model){
        this.license = license;
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
