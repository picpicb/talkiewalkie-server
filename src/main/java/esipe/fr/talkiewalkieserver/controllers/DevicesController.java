package esipe.fr.talkiewalkieserver.controllers;

import com.sun.org.apache.xpath.internal.operations.And;
import esipe.fr.talkiewalkieserver.entities.AndroidDevice;
import esipe.fr.talkiewalkieserver.services.DeviceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Devices")
public class DevicesController {
    private DeviceService deviceService;

    @Autowired
    public DevicesController(final DeviceService deviceService){
        this.deviceService = deviceService;
    }

    @RequestMapping(value = "/devices/{deviceId}", method = RequestMethod.GET)
    @ApiOperation(value = "Get device by ID")
    @ResponseBody
    public AndroidDevice getDeviceById(@PathVariable("deviceId") Integer id) {
        return this.deviceService.getDeviceById(id);
    }


    @RequestMapping(value = "/devices", method = RequestMethod.GET)
    @ApiOperation(value = "Get all devices")
    @ResponseBody
    public List<AndroidDevice> getAllDevices(){
        return this.deviceService.getAllDevices();
    }


    @RequestMapping(value = "/devices", method = RequestMethod.POST)
    @ApiOperation(value = "Add a device")
    @ResponseBody
    public void addDevice(@RequestBody AndroidDevice device){
        this.deviceService.addDevice(device);
    }

    @RequestMapping(value = "/devices/{deviceId}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Delete a device by ID")
    @ResponseBody
    public void deleteDeviceById(@RequestBody Integer id) {
        this.deviceService.deleteDevice(id);
    }

}
