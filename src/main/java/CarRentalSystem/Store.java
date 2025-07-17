package CarRentalSystem;

import java.util.List;

public class Store
{
    int storeId;
    List<Reservation>reservations;
    VehicleInventoryManagement vehicleInventory;
    Location location;

    public List<Vehicle> getVehicles(VehicleType vehicleType)
    {
        return vehicleInventory.getVehicleList();
    }
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public VehicleInventoryManagement getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(VehicleInventoryManagement vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
