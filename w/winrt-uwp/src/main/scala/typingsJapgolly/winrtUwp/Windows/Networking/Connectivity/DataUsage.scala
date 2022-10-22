package typingsJapgolly.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data usage information returned by the ConnectionProfile.GetLocalUsage method. */
trait DataUsage extends StObject {
  
  /** Gets a value indicating the number of bytes received by a connection over a specific period of time. */
  var bytesReceived: Double
  
  /** Gets a value indicating the number of bytes sent by the connection over a specific period of time. */
  var bytesSent: Double
}
object DataUsage {
  
  inline def apply(bytesReceived: Double, bytesSent: Double): DataUsage = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataUsage]
  }
  
  extension [Self <: DataUsage](x: Self) {
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
  }
}
