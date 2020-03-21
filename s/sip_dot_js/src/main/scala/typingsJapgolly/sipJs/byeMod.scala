package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/bye", JSImport.Namespace)
@js.native
object byeMod extends js.Object {
  type IncomingByeRequest = IncomingRequest
  type IncomingByeResponse = IncomingResponse
  type OutgoingByeRequest = OutgoingRequest
}

