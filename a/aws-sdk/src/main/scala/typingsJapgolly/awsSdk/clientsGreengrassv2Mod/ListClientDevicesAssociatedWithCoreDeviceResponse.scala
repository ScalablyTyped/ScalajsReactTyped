package typingsJapgolly.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClientDevicesAssociatedWithCoreDeviceResponse extends StObject {
  
  /**
    * A list that describes the client devices that are associated with the core device.
    */
  var associatedClientDevices: js.UndefOr[AssociatedClientDeviceList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListClientDevicesAssociatedWithCoreDeviceResponse {
  
  inline def apply(): ListClientDevicesAssociatedWithCoreDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientDevicesAssociatedWithCoreDeviceResponse]
  }
  
  extension [Self <: ListClientDevicesAssociatedWithCoreDeviceResponse](x: Self) {
    
    inline def setAssociatedClientDevices(value: AssociatedClientDeviceList): Self = StObject.set(x, "associatedClientDevices", value.asInstanceOf[js.Any])
    
    inline def setAssociatedClientDevicesUndefined: Self = StObject.set(x, "associatedClientDevices", js.undefined)
    
    inline def setAssociatedClientDevicesVarargs(value: AssociatedClientDevice*): Self = StObject.set(x, "associatedClientDevices", js.Array(value*))
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
