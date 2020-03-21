package typingsJapgolly.samchon

import org.scalajs.dom.raw.MessageEvent
import typingsJapgolly.samchon.communicatorBaseMod.CommunicatorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/communicator/DedicatedWorkerCommunicator", JSImport.Namespace)
@js.native
object dedicatedWorkerCommunicatorMod extends js.Object {
  @js.native
  abstract class DedicatedWorkerCommunicator () extends CommunicatorBase {
    /**
      * @hidden
      */
    /* protected */ def _Handle_message(event: MessageEvent): Unit = js.native
  }
  
}

