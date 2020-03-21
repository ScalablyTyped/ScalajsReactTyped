package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.coreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions/session-description-handler", JSImport.Namespace)
@js.native
object sessionDescriptionHandlerMod extends js.Object {
  @js.native
  class SessionDescriptionHandlerError () extends Exception {
    def this(message: String) = this()
  }
  
}

