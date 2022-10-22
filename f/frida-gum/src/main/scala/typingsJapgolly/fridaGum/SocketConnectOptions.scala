package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.TcpConnectOptions
  - typingsJapgolly.fridaGum.UnixConnectOptions
*/
trait SocketConnectOptions extends StObject
object SocketConnectOptions {
  
  inline def TcpConnectOptions(port: Double): typingsJapgolly.fridaGum.TcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.TcpConnectOptions]
  }
  
  inline def UnixConnectOptions(path: String): typingsJapgolly.fridaGum.UnixConnectOptions = {
    val __obj = js.Dynamic.literal(family = "unix", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.UnixConnectOptions]
  }
}
