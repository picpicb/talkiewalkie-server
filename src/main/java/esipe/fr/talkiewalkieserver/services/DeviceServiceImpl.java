package esipe.fr.talkiewalkieserver.services;

import esipe.fr.talkiewalkieserver.entities.AndroidDevice;
import esipe.fr.talkiewalkieserver.repositories.AndroidDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    private AndroidDeviceRepository deviceRepository;

    @Autowired
    public DeviceServiceImpl(final AndroidDeviceRepository deviceRepository){
        this.deviceRepository = deviceRepository;
    }

    @Override
    public AndroidDevice getDeviceById(Integer id) {
        return this.deviceRepository.getDeviceById(id);
    }

    @Override
    public void addDevice(AndroidDevice device) {
        this.deviceRepository.addDevices(device);
    }

    @Override
    public List<AndroidDevice> getAllDevices() {
        return this.deviceRepository.getAllDevices();
    }

    @Override
    public void deleteDevice(Integer id) {
        this.deviceRepository.deleteDevice(id);
    }
}
