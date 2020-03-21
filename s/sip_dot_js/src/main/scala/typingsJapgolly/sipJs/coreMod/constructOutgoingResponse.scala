package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.outgoingResponseMod.OutgoingResponse
import typingsJapgolly.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "constructOutgoingResponse")
@js.native
object constructOutgoingResponse extends js.Object {
  def apply(
    message: typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
}

