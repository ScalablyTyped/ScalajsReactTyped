package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceEventsResponse extends StObject {
  
  /**
    * The device events requested for the device ARN.
    */
  var DeviceEvents: js.UndefOr[DeviceEventList] = js.undefined
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}
object ListDeviceEventsResponse {
  
  inline def apply(): ListDeviceEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceEventsResponse]
  }
  
  extension [Self <: ListDeviceEventsResponse](x: Self) {
    
    inline def setDeviceEvents(value: DeviceEventList): Self = StObject.set(x, "DeviceEvents", value.asInstanceOf[js.Any])
    
    inline def setDeviceEventsUndefined: Self = StObject.set(x, "DeviceEvents", js.undefined)
    
    inline def setDeviceEventsVarargs(value: DeviceEvent*): Self = StObject.set(x, "DeviceEvents", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
