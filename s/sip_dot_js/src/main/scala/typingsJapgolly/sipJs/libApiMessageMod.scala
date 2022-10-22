package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreMessagesMethodsMessageMod.IncomingMessageRequest
import typingsJapgolly.sipJs.libCoreMessagesOutgoingResponseMod.ResponseOptions
import typingsJapgolly.sipJs.libCoreMod.IncomingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiMessageMod {
  
  @JSImport("sip.js/lib/api/message", "Message")
  @js.native
  open class Message protected () extends StObject {
    /** @internal */
    def this(incomingMessageRequest: IncomingMessageRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /* private */ var incomingMessageRequest: Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming MESSAGE request message. */
    def request: IncomingRequestMessage = js.native
  }
}
