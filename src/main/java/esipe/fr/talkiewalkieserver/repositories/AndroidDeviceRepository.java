package esipe.fr.talkiewalkieserver.repositories;

import esipe.fr.talkiewalkieserver.entities.AndroidDevice;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AndroidDeviceRepository {
    private ArrayList<AndroidDevice> devices;

    public AndroidDeviceRepository() {
        this.devices = new ArrayList<>();
    }

    public  AndroidDevice getDeviceById(Integer id){
        for (AndroidDevice d : this.devices) {
            if(d.getId().equals(id)) {
                return d;
            }
        }
        return null;
    }

    public void addDevices(AndroidDevice device){
        this.devices.add(device);
    }

    public List<AndroidDevice> getAllDevices(){
        return this.devices;
    }

    public void deleteDevice(Integer id) {
        this.devices.remove(getDeviceById(id));
    }


}
