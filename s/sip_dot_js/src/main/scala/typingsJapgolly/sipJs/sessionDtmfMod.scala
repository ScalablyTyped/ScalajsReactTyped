package typingsJapgolly.sipJs

import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.sipJs.coreMod.IncomingResponseMessage
import typingsJapgolly.sipJs.enumsMod.TypeStrings
import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.libSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session/DTMF", JSImport.Namespace)
@js.native
object sessionDtmfMod extends js.Object {
  @js.native
  class DTMF protected () extends EventEmitter {
    def this(session: Session, tone: String) = this()
    def this(session: Session, tone: Double) = this()
    def this(session: Session, tone: String, options: js.Any) = this()
    def this(session: Session, tone: Double, options: js.Any) = this()
    var C: js.Any = js.native
    var duration: Double = js.native
    var interToneGap: Double = js.native
    var logger: js.Any = js.native
    var owner: js.Any = js.native
    var tone: String = js.native
    var `type`: TypeStrings = js.native
    def init_incoming(request: IncomingRequest): Unit = js.native
    def onDialogError(response: IncomingResponseMessage): Unit = js.native
    def onRequestTimeout(): Unit = js.native
    def onTransportError(): Unit = js.native
    def receiveResponse(response: IncomingResponseMessage): Unit = js.native
    def send(): Unit = js.native
    def send(options: js.Any): Unit = js.native
  }
  
}

