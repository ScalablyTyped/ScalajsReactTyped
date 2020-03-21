package typingsJapgolly.sipJs

import org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit
import typingsJapgolly.sipJs.coreMod.Logger
import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typingsJapgolly.sipJs.libSessionMod.InviteClientContext
import typingsJapgolly.sipJs.libSessionMod.InviteServerContext
import typingsJapgolly.sipJs.sessionMod.Session
import typingsJapgolly.sipJs.webSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web", JSImport.Namespace)
@js.native
object libWebMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsJapgolly.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  @js.native
  class Simple protected ()
    extends typingsJapgolly.sipJs.simpleMod.Simple {
    def this(options: js.Any) = this()
  }
  
  @js.native
  class Transport protected ()
    extends typingsJapgolly.sipJs.libWebTransportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: js.Any) = this()
  }
  
  @js.native
  object Modifiers extends js.Object {
    def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
    def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: InviteClientContext, options: js.Any): typingsJapgolly.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: InviteServerContext, options: js.Any): typingsJapgolly.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: Session, options: js.Any): typingsJapgolly.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
  /* static members */
  @js.native
  object Simple extends js.Object {
    val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SimpleStatus */ js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Transport extends js.Object {
    val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TransportStatus */ js.Any = js.native
  }
  
}

