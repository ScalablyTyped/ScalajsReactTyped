package typingsJapgolly.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /**
    * The device's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Indicates how likely a device is available for a test run. Currently available in the ListDevices and GetDevice API methods.
    */
  var availability: js.UndefOr[DeviceAvailability] = js.undefined
  
  /**
    * The device's carrier.
    */
  var carrier: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the device's CPU.
    */
  var cpu: js.UndefOr[CPU] = js.undefined
  
  /**
    * The name of the fleet to which this device belongs.
    */
  var fleetName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of fleet to which this device belongs. Possible values are PRIVATE and PUBLIC.
    */
  var fleetType: js.UndefOr[String] = js.undefined
  
  /**
    * The device's form factor. Allowed values include:   PHONE   TABLET  
    */
  var formFactor: js.UndefOr[DeviceFormFactor] = js.undefined
  
  /**
    * The device's heap size, expressed in bytes.
    */
  var heapSize: js.UndefOr[Long] = js.undefined
  
  /**
    * The device's image name.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * The instances that belong to this device.
    */
  var instances: js.UndefOr[DeviceInstances] = js.undefined
  
  /**
    * The device's manufacturer name.
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * The device's total memory size, expressed in bytes.
    */
  var memory: js.UndefOr[Long] = js.undefined
  
  /**
    * The device's model name.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * The device's model ID.
    */
  var modelId: js.UndefOr[String] = js.undefined
  
  /**
    * The device's display name.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The device's operating system type.
    */
  var os: js.UndefOr[String] = js.undefined
  
  /**
    * The device's platform. Allowed values include:   ANDROID   IOS  
    */
  var platform: js.UndefOr[DevicePlatform] = js.undefined
  
  /**
    * The device's radio.
    */
  var radio: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether remote access has been enabled for the specified device.
    */
  var remoteAccessEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This flag is set to true if remote debugging is enabled for the device. Remote debugging is no longer supported.
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resolution of the device.
    */
  var resolution: js.UndefOr[Resolution] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAvailability(value: DeviceAvailability): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setCpu(value: CPU): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setFleetName(value: String): Self = StObject.set(x, "fleetName", value.asInstanceOf[js.Any])
    
    inline def setFleetNameUndefined: Self = StObject.set(x, "fleetName", js.undefined)
    
    inline def setFleetType(value: String): Self = StObject.set(x, "fleetType", value.asInstanceOf[js.Any])
    
    inline def setFleetTypeUndefined: Self = StObject.set(x, "fleetType", js.undefined)
    
    inline def setFormFactor(value: DeviceFormFactor): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    inline def setHeapSize(value: Long): Self = StObject.set(x, "heapSize", value.asInstanceOf[js.Any])
    
    inline def setHeapSizeUndefined: Self = StObject.set(x, "heapSize", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInstances(value: DeviceInstances): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: DeviceInstance*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setMemory(value: Long): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelId(value: String): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setPlatform(value: DevicePlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
    
    inline def setRemoteAccessEnabled(value: Boolean): Self = StObject.set(x, "remoteAccessEnabled", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessEnabledUndefined: Self = StObject.set(x, "remoteAccessEnabled", js.undefined)
    
    inline def setRemoteDebugEnabled(value: Boolean): Self = StObject.set(x, "remoteDebugEnabled", value.asInstanceOf[js.Any])
    
    inline def setRemoteDebugEnabledUndefined: Self = StObject.set(x, "remoteDebugEnabled", js.undefined)
    
    inline def setResolution(value: Resolution): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
