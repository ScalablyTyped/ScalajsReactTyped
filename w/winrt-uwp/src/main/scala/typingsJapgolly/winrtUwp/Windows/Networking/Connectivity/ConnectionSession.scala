package typingsJapgolly.winrtUwp.Windows.Networking.Connectivity

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ConnectionSession class is used to represent a connection to an access point established with AcquireConnectionAsync . */
trait ConnectionSession extends StObject {
  
  /** Closes the connection to the access point. */
  def close(): Unit
  
  /** Retrieves the ConnectionProfile associated with the connection session. */
  var connectionProfile: ConnectionProfile
}
object ConnectionSession {
  
  inline def apply(close: Callback, connectionProfile: ConnectionProfile): ConnectionSession = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, connectionProfile = connectionProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionSession]
  }
  
  extension [Self <: ConnectionSession](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setConnectionProfile(value: ConnectionProfile): Self = StObject.set(x, "connectionProfile", value.asInstanceOf[js.Any])
  }
}
