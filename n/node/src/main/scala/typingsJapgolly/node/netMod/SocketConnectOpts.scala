package typingsJapgolly.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.netMod.TcpSocketConnectOpts
  - typingsJapgolly.node.netMod.IpcSocketConnectOpts
*/
trait SocketConnectOpts extends StObject
object SocketConnectOpts {
  
  inline def IpcSocketConnectOpts(path: String): typingsJapgolly.node.netMod.IpcSocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.node.netMod.IpcSocketConnectOpts]
  }
  
  inline def TcpSocketConnectOpts(port: Double): typingsJapgolly.node.netMod.TcpSocketConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.node.netMod.TcpSocketConnectOpts]
  }
}
