package typingsJapgolly.samchon

import typingsJapgolly.samchon.dedicatedWorkerServerMod.DedicatedWorkerServer
import typingsJapgolly.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/base/DedicatedWorkerServerBase", JSImport.Namespace)
@js.native
object dedicatedWorkerServerBaseMod extends js.Object {
  @js.native
  class DedicatedWorkerServerBase protected () extends DedicatedWorkerServer {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
    /**
      * @hidden
      */
    var hooker_ : js.Any = js.native
  }
  
}

