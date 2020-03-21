package typingsJapgolly.sipJs

import org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit
import typingsJapgolly.sipJs.apiMod.Session
import typingsJapgolly.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typingsJapgolly.sipJs.coreMod.Logger
import typingsJapgolly.sipJs.simpleUserOptionsMod.SimpleUserOptions
import typingsJapgolly.sipJs.webTransportMod.TransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/web", JSImport.Namespace)
@js.native
object webMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsJapgolly.sipJs.webSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, options: js.Any) = this()
  }
  
  @js.native
  class SimpleUser protected ()
    extends typingsJapgolly.sipJs.simpleUserMod.SimpleUser {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SimpleUserOptions) = this()
  }
  
  @js.native
  class Transport protected ()
    extends typingsJapgolly.sipJs.webTransportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
  }
  
  def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
  def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    def defaultFactory(session: Session, options: js.Any): typingsJapgolly.sipJs.webSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
  /* static members */
  @js.native
  object Transport extends js.Object {
    var defaultOptions: js.Any = js.native
  }
  
}

