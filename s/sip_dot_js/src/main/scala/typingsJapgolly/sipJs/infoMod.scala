package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.coreMod.IncomingRequestMessage
import typingsJapgolly.sipJs.methodsInfoMod.IncomingInfoRequest
import typingsJapgolly.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/info", JSImport.Namespace)
@js.native
object infoMod extends js.Object {
  @js.native
  class Info protected () extends js.Object {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest) = this()
    var incomingInfoRequest: js.Any = js.native
    /** Incoming MESSAGE request message. */
    val request: IncomingRequestMessage = js.native
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
  }
  
}

