package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingMessageMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/incoming-response-message", JSImport.Namespace)
@js.native
object incomingResponseMessageMod extends js.Object {
  @js.native
  class IncomingResponseMessage () extends IncomingMessage {
    var reasonPhrase: js.UndefOr[String] = js.native
    var statusCode: js.UndefOr[Double] = js.native
  }
  
}

