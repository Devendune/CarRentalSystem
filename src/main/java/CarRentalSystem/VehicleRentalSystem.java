package CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem
{
    List<Vehicle>vehicles;
    List<Store>stores;

    VehicleRentalSystem(List<Vehicle>vehicles,List<Store>stores)
    {
        this.vehicles=vehicles;
        this.stores=stores;
    }

    public Store getStore(Location location)
    {
        return stores.get(0);
    }
}
