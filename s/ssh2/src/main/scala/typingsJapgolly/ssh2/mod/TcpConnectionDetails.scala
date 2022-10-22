package typingsJapgolly.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpConnectionDetails extends StObject {
  
  /** The remote IP the connection was received on (given in earlier call to `forwardIn()`). */
  var destIP: String
  
  /** The remote port the connection was received on (given in earlier call to `forwardIn()`). */
  var destPort: Double
  
  /** The originating IP of the connection. */
  var srcIP: String
  
  /** The originating port of the connection. */
  var srcPort: Double
}
object TcpConnectionDetails {
  
  inline def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpConnectionDetails = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpConnectionDetails]
  }
  
  extension [Self <: TcpConnectionDetails](x: Self) {
    
    inline def setDestIP(value: String): Self = StObject.set(x, "destIP", value.asInstanceOf[js.Any])
    
    inline def setDestPort(value: Double): Self = StObject.set(x, "destPort", value.asInstanceOf[js.Any])
    
    inline def setSrcIP(value: String): Self = StObject.set(x, "srcIP", value.asInstanceOf[js.Any])
    
    inline def setSrcPort(value: Double): Self = StObject.set(x, "srcPort", value.asInstanceOf[js.Any])
  }
}
