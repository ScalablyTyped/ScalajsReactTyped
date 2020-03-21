package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/message", JSImport.Namespace)
@js.native
object methodsMessageMod extends js.Object {
  type IncomingMessageRequest = IncomingRequest
  type IncomingMessageResponse = IncomingResponse
  type OutgoingMessageRequest = OutgoingRequest
}

