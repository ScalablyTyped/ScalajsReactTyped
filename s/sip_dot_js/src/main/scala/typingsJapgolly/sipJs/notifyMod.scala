package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/notify", JSImport.Namespace)
@js.native
object notifyMod extends js.Object {
  type IncomingNotifyRequest = IncomingRequest
  type IncomingNotifyResponse = IncomingResponse
  type OutgoingNotifyRequest = OutgoingRequest
}

