package CarRentalSystem;

import java.util.List;

public class VehicleInventoryManagement
{
    List<Vehicle> vehicleList;
    public VehicleInventoryManagement(List<Vehicle>vehicles)
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
