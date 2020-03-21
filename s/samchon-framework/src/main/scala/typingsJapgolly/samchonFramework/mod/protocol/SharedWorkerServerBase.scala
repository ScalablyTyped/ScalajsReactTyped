package typingsJapgolly.samchonFramework.mod.protocol

import typingsJapgolly.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol.SharedWorkerServerBase")
@js.native
class SharedWorkerServerBase protected ()
  extends typingsJapgolly.samchon.mod.protocol.SharedWorkerServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}

