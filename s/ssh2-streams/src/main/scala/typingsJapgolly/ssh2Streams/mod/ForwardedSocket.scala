package typingsJapgolly.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedSocket extends StObject {
  
  var socketPath: String
}
object ForwardedSocket {
  
  inline def apply(socketPath: String): ForwardedSocket = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedSocket]
  }
  
  extension [Self <: ForwardedSocket](x: Self) {
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
