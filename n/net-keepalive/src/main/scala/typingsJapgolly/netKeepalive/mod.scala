package typingsJapgolly.netKeepalive

import typingsJapgolly.node.NodeJS.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net-keepalive", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def setKeepAliveInterval(socket: NodeJSSocketWithFileDescriptor, intvl: Double): Double = js.native
  def setKeepAliveProbes(socket: NodeJSSocketWithFileDescriptor, cnt: Double): Double = js.native
  type NodeJSSocketWithFileDescriptor = Socket | AnonHandle
}

