package typingsJapgolly.winrtUwp.Windows.Devices.WiFi

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the result of a network scan operation. */
trait WiFiNetworkReport extends StObject {
  
  /** A list of available networks. */
  var availableNetworks: IVectorView[WiFiAvailableNetwork]
  
  /** Contains the result of a network scan operation. */
  var timestamp: js.Date
}
object WiFiNetworkReport {
  
  inline def apply(availableNetworks: IVectorView[WiFiAvailableNetwork], timestamp: js.Date): WiFiNetworkReport = {
    val __obj = js.Dynamic.literal(availableNetworks = availableNetworks.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiNetworkReport]
  }
  
  extension [Self <: WiFiNetworkReport](x: Self) {
    
    inline def setAvailableNetworks(value: IVectorView[WiFiAvailableNetwork]): Self = StObject.set(x, "availableNetworks", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
