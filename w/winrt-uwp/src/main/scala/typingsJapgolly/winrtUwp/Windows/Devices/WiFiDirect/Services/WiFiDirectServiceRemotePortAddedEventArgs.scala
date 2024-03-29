package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect.Services

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Networking.EndpointPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returned when a WiFiDirectServiceSession.RemotePortAdded event is raised. Your event handler should use this information to establish new socket connections to the new port. */
trait WiFiDirectServiceRemotePortAddedEventArgs extends StObject {
  
  /** Gets the endpoint pairs associated with the new remote port. */
  var endpointPairs: IVectorView[EndpointPair]
  
  /** Gets the protocol used to communicate with the new remote port. */
  var protocol: WiFiDirectServiceIPProtocol
}
object WiFiDirectServiceRemotePortAddedEventArgs {
  
  inline def apply(endpointPairs: IVectorView[EndpointPair], protocol: WiFiDirectServiceIPProtocol): WiFiDirectServiceRemotePortAddedEventArgs = {
    val __obj = js.Dynamic.literal(endpointPairs = endpointPairs.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceRemotePortAddedEventArgs]
  }
  
  extension [Self <: WiFiDirectServiceRemotePortAddedEventArgs](x: Self) {
    
    inline def setEndpointPairs(value: IVectorView[EndpointPair]): Self = StObject.set(x, "endpointPairs", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: WiFiDirectServiceIPProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
