package typingsJapgolly.winrtUwp.Windows.Networking.Proximity

import typingsJapgolly.winrtUwp.Windows.Networking.Sockets.StreamSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains properties that the TriggeredConnectionStateChanged event passes to an application. */
trait TriggeredConnectionStateChangedEventArgs extends StObject {
  
  /** Gets the unique identifier for the connection in progress. */
  var id: Double
  
  /** Gets the StreamSocket instance for the connection. */
  var socket: StreamSocket
  
  /** Gets the state of the connection in progress. */
  var state: TriggeredConnectState
}
object TriggeredConnectionStateChangedEventArgs {
  
  inline def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): TriggeredConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeredConnectionStateChangedEventArgs]
  }
  
  extension [Self <: TriggeredConnectionStateChangedEventArgs](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSocket(value: StreamSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setState(value: TriggeredConnectState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
