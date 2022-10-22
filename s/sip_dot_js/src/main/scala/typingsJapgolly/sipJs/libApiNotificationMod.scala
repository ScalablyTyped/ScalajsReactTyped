package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typingsJapgolly.sipJs.libCoreMessagesOutgoingResponseMod.ResponseOptions
import typingsJapgolly.sipJs.libCoreMod.IncomingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiNotificationMod {
  
  @JSImport("sip.js/lib/api/notification", "Notification")
  @js.native
  open class Notification protected () extends StObject {
    /** @internal */
    def this(incomingNotifyRequest: IncomingNotifyRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /* private */ var incomingNotifyRequest: Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming NOTIFY request message. */
    def request: IncomingRequestMessage = js.native
  }
}
