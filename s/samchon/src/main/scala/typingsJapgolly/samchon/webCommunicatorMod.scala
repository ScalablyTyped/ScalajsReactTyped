package typingsJapgolly.samchon

import typingsJapgolly.samchon.communicatorBaseMod.CommunicatorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/communicator/WebCommunicator", JSImport.Namespace)
@js.native
object webCommunicatorMod extends js.Object {
  @js.native
  abstract class WebCommunicator () extends CommunicatorBase {
    /**
      * @hidden
      */
    var _Handle_message: js.Any = js.native
    /**
      * @hidden
      */
    var connection_ : js.Any = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_close(): Unit = js.native
  }
  
}

