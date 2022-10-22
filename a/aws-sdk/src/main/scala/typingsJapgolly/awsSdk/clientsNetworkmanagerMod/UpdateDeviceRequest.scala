package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceRequest extends StObject {
  
  /**
    * The Amazon Web Services location of the device, if applicable. For an on-premises device, you can omit this parameter.
    */
  var AWSLocation: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.AWSLocation] = js.undefined
  
  /**
    * A description of the device. Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the device.
    */
  var DeviceId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.DeviceId
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  var Location: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.Location] = js.undefined
  
  /**
    * The model of the device. Constraints: Maximum length of 128 characters.
    */
  var Model: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The serial number of the device. Constraints: Maximum length of 128 characters.
    */
  var SerialNumber: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.SiteId] = js.undefined
  
  /**
    * The type of the device.
    */
  var Type: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The vendor of the device. Constraints: Maximum length of 128 characters.
    */
  var Vendor: js.UndefOr[ConstrainedString] = js.undefined
}
object UpdateDeviceRequest {
  
  inline def apply(DeviceId: DeviceId, GlobalNetworkId: GlobalNetworkId): UpdateDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceRequest]
  }
  
  extension [Self <: UpdateDeviceRequest](x: Self) {
    
    inline def setAWSLocation(value: AWSLocation): Self = StObject.set(x, "AWSLocation", value.asInstanceOf[js.Any])
    
    inline def setAWSLocationUndefined: Self = StObject.set(x, "AWSLocation", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setModel(value: ConstrainedString): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    inline def setSerialNumber(value: ConstrainedString): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    inline def setType(value: ConstrainedString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVendor(value: ConstrainedString): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "Vendor", js.undefined)
  }
}
