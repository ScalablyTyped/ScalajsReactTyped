package typingsJapgolly.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesResponse extends StObject {
  
  /**
    * A list of devices.
    */
  var Devices: DeviceList
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
}
object ListDevicesResponse {
  
  inline def apply(Devices: DeviceList): ListDevicesResponse = {
    val __obj = js.Dynamic.literal(Devices = Devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicesResponse]
  }
  
  extension [Self <: ListDevicesResponse](x: Self) {
    
    inline def setDevices(value: DeviceList): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "Devices", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
