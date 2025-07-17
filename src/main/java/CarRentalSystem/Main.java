package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<User>users= addUsers();
        List<Vehicle>vehicles=addVehicles();
        List<Store>stores=addStores();

        VehicleRentalSystem vehicleRentalSystem=new VehicleRentalSystem(vehicles,stores);
        User user=users.get(0);

        Location location=new Location("Om villa","Dehradun","Doon",248001);
        Store store=vehicleRentalSystem.getStore(location);
        List<Vehicle>vehicleList=store.getVehicles(VehicleType.CAR);


    }
    public static List<Store> addStores()
    {
        List<Store>stores=new ArrayList<>();
        Store store=new Store();
        store.storeId=1;

        stores.add(store);
        return stores;
    }

    public static List<User> addUsers()
    {
        List<User>users=new ArrayList<>();

        User user=new User();
        user.setUserId(1);
        user.setDrivingLicense("Devendu License here");

        User secondUser=new User();
        user.setUserId(2);
        user.setDrivingLicense("Vinay License here");

        users.add(user);
        users.add(secondUser);

        return users;
    }

    public static List<Vehicle> addVehicles()
    {
        List<Vehicle>vehicles=new ArrayList<>();

        Vehicle vehicle=new Vehicle();
        vehicle.setId(1);
        vehicle.setVehicleType(VehicleType.CAR);;
        vehicle.setVehNo(4691);

        Vehicle secondVehicle=new Vehicle();
        secondVehicle.setId(2);
        secondVehicle.setVehicleType(VehicleType.BIKE);
        secondVehicle.setVehNo(5323);

        vehicles.add(vehicle);
        vehicles.add(secondVehicle);

        return vehicles;
    }
}