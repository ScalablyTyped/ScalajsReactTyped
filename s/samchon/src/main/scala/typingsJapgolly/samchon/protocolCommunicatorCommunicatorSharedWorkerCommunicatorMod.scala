package typingsJapgolly.samchon

import org.scalajs.dom.MessageEvent
import org.scalajs.dom.MessagePort
import typingsJapgolly.samchon.protocolCommunicatorCommunicatorCommunicatorBaseMod.CommunicatorBase
import typingsJapgolly.samchon.protocolInvokeIprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCommunicatorCommunicatorSharedWorkerCommunicatorMod {
  
  /* note: abstract class */ @JSImport("samchon/protocol/communicator/communicator/SharedWorkerCommunicator", "SharedWorkerCommunicator")
  @js.native
  /**
    * Default Constructor.
    */
  open class SharedWorkerCommunicator () extends CommunicatorBase {
    /**
      * Construct from *listener*.
      *
      * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_message(event: MessageEvent): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ var port_ : MessagePort = js.native
  }
}
