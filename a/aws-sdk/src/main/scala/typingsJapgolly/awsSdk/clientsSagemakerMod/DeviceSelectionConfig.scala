package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSelectionConfig extends StObject {
  
  /**
    * A filter to select devices with names containing this name.
    */
  var DeviceNameContains: js.UndefOr[DeviceName] = js.undefined
  
  /**
    * List of devices chosen to deploy.
    */
  var DeviceNames: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.DeviceNames] = js.undefined
  
  /**
    * Type of device subsets to deploy to the current stage.
    */
  var DeviceSubsetType: typingsJapgolly.awsSdk.clientsSagemakerMod.DeviceSubsetType
  
  /**
    * Percentage of devices in the fleet to deploy to the current stage.
    */
  var Percentage: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.Percentage] = js.undefined
}
object DeviceSelectionConfig {
  
  inline def apply(DeviceSubsetType: DeviceSubsetType): DeviceSelectionConfig = {
    val __obj = js.Dynamic.literal(DeviceSubsetType = DeviceSubsetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSelectionConfig]
  }
  
  extension [Self <: DeviceSelectionConfig](x: Self) {
    
    inline def setDeviceNameContains(value: DeviceName): Self = StObject.set(x, "DeviceNameContains", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameContainsUndefined: Self = StObject.set(x, "DeviceNameContains", js.undefined)
    
    inline def setDeviceNames(value: DeviceNames): Self = StObject.set(x, "DeviceNames", value.asInstanceOf[js.Any])
    
    inline def setDeviceNamesUndefined: Self = StObject.set(x, "DeviceNames", js.undefined)
    
    inline def setDeviceNamesVarargs(value: DeviceName*): Self = StObject.set(x, "DeviceNames", js.Array(value*))
    
    inline def setDeviceSubsetType(value: DeviceSubsetType): Self = StObject.set(x, "DeviceSubsetType", value.asInstanceOf[js.Any])
    
    inline def setPercentage(value: Percentage): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "Percentage", js.undefined)
  }
}
