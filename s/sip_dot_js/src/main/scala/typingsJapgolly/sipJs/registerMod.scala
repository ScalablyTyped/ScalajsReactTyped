package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/register", JSImport.Namespace)
@js.native
object registerMod extends js.Object {
  type IncomingRegisterRequest = IncomingRequest
  type IncomingRegisterResponse = IncomingResponse
  type OutgoingRegisterRequest = OutgoingRequest
}

