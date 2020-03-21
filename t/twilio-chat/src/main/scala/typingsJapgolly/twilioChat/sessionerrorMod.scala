package typingsJapgolly.twilioChat

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-chat/lib/sessionerror", JSImport.Namespace)
@js.native
object sessionerrorMod extends js.Object {
  @js.native
  class SessionError protected () extends Error {
    def this(message: String, code: Double) = this()
    var code: Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

