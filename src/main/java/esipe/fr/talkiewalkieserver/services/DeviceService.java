package esipe.fr.talkiewalkieserver.services;

import esipe.fr.talkiewalkieserver.entities.AndroidDevice;

import java.util.List;


public interface DeviceService {
    AndroidDevice getDeviceById(Integer id);
    void addDevice(AndroidDevice device);
    List<AndroidDevice> getAllDevices();
    void deleteDevice(Integer id);
}