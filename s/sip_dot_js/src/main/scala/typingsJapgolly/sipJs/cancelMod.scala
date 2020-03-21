package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/cancel", JSImport.Namespace)
@js.native
object cancelMod extends js.Object {
  type IncomingCancelRequest = IncomingRequest
  type IncomingCancelResponse = IncomingResponse
  type OutgoingCancelRequest = OutgoingRequest
}

