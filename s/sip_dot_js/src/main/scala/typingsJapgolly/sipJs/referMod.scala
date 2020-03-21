package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/refer", JSImport.Namespace)
@js.native
object referMod extends js.Object {
  type IncomingReferRequest = IncomingRequest
  type IncomingReferResponse = IncomingResponse
  type OutgoingReferRequest = OutgoingRequest
}

