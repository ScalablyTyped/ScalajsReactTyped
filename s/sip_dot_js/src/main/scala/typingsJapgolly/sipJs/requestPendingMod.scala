package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.coreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions/request-pending", JSImport.Namespace)
@js.native
object requestPendingMod extends js.Object {
  @js.native
  /** @internal */
  class RequestPendingError () extends Exception {
    def this(message: String) = this()
  }
  
}

