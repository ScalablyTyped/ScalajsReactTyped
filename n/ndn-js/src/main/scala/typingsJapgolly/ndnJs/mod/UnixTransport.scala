package typingsJapgolly.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "UnixTransport")
@js.native
class UnixTransport ()
  extends typingsJapgolly.ndnJs.transportMod.Transport

@JSImport("ndn-js", "UnixTransport")
@js.native
object UnixTransport extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends typingsJapgolly.ndnJs.transportMod.UnixTransport.ConnectionInfo {
    def this(filePath: String) = this()
  }
  
}

