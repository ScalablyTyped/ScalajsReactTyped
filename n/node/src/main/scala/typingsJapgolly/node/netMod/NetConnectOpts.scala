package typingsJapgolly.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.netMod.TcpNetConnectOpts
  - typingsJapgolly.node.netMod.IpcNetConnectOpts
*/
trait NetConnectOpts extends StObject
object NetConnectOpts {
  
  inline def IpcNetConnectOpts(path: String): typingsJapgolly.node.netMod.IpcNetConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.node.netMod.IpcNetConnectOpts]
  }
  
  inline def TcpNetConnectOpts(port: Double): typingsJapgolly.node.netMod.TcpNetConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.node.netMod.TcpNetConnectOpts]
  }
}
