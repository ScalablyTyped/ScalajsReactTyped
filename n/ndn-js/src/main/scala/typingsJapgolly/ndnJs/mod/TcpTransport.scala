package typingsJapgolly.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "TcpTransport")
@js.native
class TcpTransport ()
  extends typingsJapgolly.ndnJs.transportMod.Transport

@JSImport("ndn-js", "TcpTransport")
@js.native
object TcpTransport extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends typingsJapgolly.ndnJs.transportMod.TcpTransport.ConnectionInfo {
    def this(host: String, port: Double) = this()
  }
  
}

