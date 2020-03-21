package typingsJapgolly.samchon.protocolMod

import org.scalajs.dom.raw.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "SharedWorkerClientDriver")
@js.native
class SharedWorkerClientDriver protected ()
  extends typingsJapgolly.samchon.sharedWorkerClientDriverMod.SharedWorkerClientDriver {
  /**
    * Construct from a MessagePort object.
    */
  def this(port: MessagePort) = this()
}

