package CarRentalSystem;

public class Vehicle
{
    int id;
    VehicleType vehicleType;
    int vehNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getVehNo() {
        return vehNo;
    }

    public void setVehNo(int vehNo) {
        this.vehNo = vehNo;
    }
}
