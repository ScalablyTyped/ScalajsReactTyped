package typingsJapgolly.samchon.protocolMod

import typingsJapgolly.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "DedicatedWorkerServerBase")
@js.native
class DedicatedWorkerServerBase protected ()
  extends typingsJapgolly.samchon.dedicatedWorkerServerBaseMod.DedicatedWorkerServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}

