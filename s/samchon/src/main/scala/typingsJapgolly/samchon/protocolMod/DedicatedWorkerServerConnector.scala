package typingsJapgolly.samchon.protocolMod

import typingsJapgolly.samchon.iprotocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "DedicatedWorkerServerConnector")
@js.native
class DedicatedWorkerServerConnector protected ()
  extends typingsJapgolly.samchon.dedicatedWorkerServerConnectorMod.DedicatedWorkerServerConnector {
  /**
    * Construct from *listener*.
    *
    * @param listener A listener object to listen replied message from newly connected client in
    *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
    */
  def this(listener: IProtocol) = this()
}

