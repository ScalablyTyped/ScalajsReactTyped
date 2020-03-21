package typingsJapgolly.samchon

import org.scalajs.dom.raw.MessagePort
import typingsJapgolly.samchon.iprotocolMod.IProtocol
import typingsJapgolly.samchon.sharedWorkerCommunicatorMod.SharedWorkerCommunicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/client_driver/SharedWorkerClientDriver", JSImport.Namespace)
@js.native
object sharedWorkerClientDriverMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsJapgolly.samchon.icommunicatorMod.ICommunicator because Already inherited
  - typingsJapgolly.samchon.iclientdriverMod.IClientDriver because var conflicts: onClose. Inlined listen */ @js.native
  class SharedWorkerClientDriver protected () extends SharedWorkerCommunicator {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: MessagePort) = this()
    /**
      * @hidden
      */
    var listening_ : js.Any = js.native
    /**
      * @inheritdoc
      */
    /**
      * Listen message from the newly connected client.
      *
      * Starts listening message from the newly connected client. Replied message from the connected client will be
      * converted to {@link Invoke} classes and shifted to the *listener*'s {@link IProtocol.replyData replyData()}
      * method.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def listen(listener: IProtocol): Unit = js.native
  }
  
}

