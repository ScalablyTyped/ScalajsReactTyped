package typingsJapgolly.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketForwardingConfig extends StObject {
  
  var socketPath: String
}
object SocketForwardingConfig {
  
  inline def apply(socketPath: String): SocketForwardingConfig = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketForwardingConfig]
  }
  
  extension [Self <: SocketForwardingConfig](x: Self) {
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
