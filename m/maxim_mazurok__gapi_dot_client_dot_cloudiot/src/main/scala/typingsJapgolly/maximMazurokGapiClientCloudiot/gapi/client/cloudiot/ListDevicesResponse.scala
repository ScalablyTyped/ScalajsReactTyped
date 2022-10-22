package typingsJapgolly.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesResponse extends StObject {
  
  /** The devices that match the request. */
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
  
  /** If not empty, indicates that there may be more devices that match the request; this value should be passed in a new `ListDevicesRequest`. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDevicesResponse {
  
  inline def apply(): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesResponse]
  }
  
  extension [Self <: ListDevicesResponse](x: Self) {
    
    inline def setDevices(value: js.Array[Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
