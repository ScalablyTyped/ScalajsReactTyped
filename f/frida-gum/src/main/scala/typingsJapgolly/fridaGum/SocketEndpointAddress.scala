package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.TcpEndpointAddress
  - typingsJapgolly.fridaGum.UnixEndpointAddress
*/
trait SocketEndpointAddress extends StObject
object SocketEndpointAddress {
  
  inline def TcpEndpointAddress(ip: String, port: Double): typingsJapgolly.fridaGum.TcpEndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.TcpEndpointAddress]
  }
  
  inline def UnixEndpointAddress(path: String): typingsJapgolly.fridaGum.UnixEndpointAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.UnixEndpointAddress]
  }
}
