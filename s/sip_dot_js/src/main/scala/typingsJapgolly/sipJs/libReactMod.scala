package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.coreMod.Logger
import typingsJapgolly.sipJs.libSessionMod.InviteClientContext
import typingsJapgolly.sipJs.libSessionMod.InviteServerContext
import typingsJapgolly.sipJs.sessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/React", JSImport.Namespace)
@js.native
object libReactMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsJapgolly.sipJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: InviteClientContext, options: js.Any): typingsJapgolly.sipJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: InviteServerContext, options: js.Any): typingsJapgolly.sipJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
}

