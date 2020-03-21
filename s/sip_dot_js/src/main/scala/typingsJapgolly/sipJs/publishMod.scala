package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/publish", JSImport.Namespace)
@js.native
object publishMod extends js.Object {
  type IncomingPublishRequest = IncomingRequest
  type IncomingPublishResponse = IncomingResponse
  type OutgoingPublishRequest = OutgoingRequest
}

