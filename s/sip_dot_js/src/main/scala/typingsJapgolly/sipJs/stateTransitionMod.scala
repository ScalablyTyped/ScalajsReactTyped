package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.coreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions/state-transition", JSImport.Namespace)
@js.native
object stateTransitionMod extends js.Object {
  @js.native
  class StateTransitionError () extends Exception {
    def this(message: String) = this()
  }
  
}

