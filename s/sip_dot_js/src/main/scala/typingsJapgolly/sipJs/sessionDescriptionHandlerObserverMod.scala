package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.enumsMod.TypeStrings
import typingsJapgolly.sipJs.libSessionMod.InviteClientContext
import typingsJapgolly.sipJs.libSessionMod.InviteServerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/React/SessionDescriptionHandlerObserver", JSImport.Namespace)
@js.native
object sessionDescriptionHandlerObserverMod extends js.Object {
  @js.native
  class SessionDescriptionHandlerObserver protected () extends js.Object {
    def this(session: InviteClientContext, options: js.Any) = this()
    def this(session: InviteServerContext, options: js.Any) = this()
    var options: js.Any = js.native
    var session: js.Any = js.native
    var `type`: TypeStrings = js.native
    def directionChanged(): Unit = js.native
    def trackAdded(): Unit = js.native
  }
  
}

