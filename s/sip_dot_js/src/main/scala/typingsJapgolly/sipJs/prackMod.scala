package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/prack", JSImport.Namespace)
@js.native
object prackMod extends js.Object {
  type IncomingPrackRequest = IncomingRequest
  type IncomingPrackResponse = IncomingResponse
  type OutgoingPrackRequest = OutgoingRequest
}

