package typingsJapgolly.netKeepalive

import typingsJapgolly.netKeepalive.anon.Handle
import typingsJapgolly.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("net-keepalive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKeepAliveInterval(socket: NodeJSSocketWithFileDescriptor): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeepAliveInterval")(socket.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getKeepAliveProbes(socket: NodeJSSocketWithFileDescriptor): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeepAliveProbes")(socket.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getUserTimeout(socket: NodeJSSocketWithFileDescriptor): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserTimeout")(socket.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setKeepAliveInterval(socket: NodeJSSocketWithFileDescriptor, intvl: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAliveInterval")(socket.asInstanceOf[js.Any], intvl.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setKeepAliveProbes(socket: NodeJSSocketWithFileDescriptor, cnt: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAliveProbes")(socket.asInstanceOf[js.Any], cnt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setUserTimeout(socket: NodeJSSocketWithFileDescriptor, timeout: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserTimeout")(socket.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type NodeJSSocketWithFileDescriptor = Socket | Handle
}
