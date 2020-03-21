package typingsJapgolly.samchon.mod.protocol

import typingsJapgolly.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "protocol.WebServerBase")
@js.native
class WebServerBase protected ()
  extends typingsJapgolly.samchon.protocolMod.WebServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}

