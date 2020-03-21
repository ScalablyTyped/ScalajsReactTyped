package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.apiMod.Session
import typingsJapgolly.sipJs.coreMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/react", JSImport.Namespace)
@js.native
object reactMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsJapgolly.sipJs.reactSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: Session, options: js.Any): typingsJapgolly.sipJs.reactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
}

