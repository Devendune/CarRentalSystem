package CarRentalSystem;

import java.util.List;

public class VehicleInventory
{
    List<Vehicle> vehicleList;
    public VehicleInventory(List<Vehicle>vehicles)
    {
        this.vehicleList=vehicles;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
