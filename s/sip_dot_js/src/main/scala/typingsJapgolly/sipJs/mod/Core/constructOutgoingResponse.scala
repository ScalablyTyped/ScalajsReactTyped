package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.outgoingResponseMod.OutgoingResponse
import typingsJapgolly.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.constructOutgoingResponse")
@js.native
object constructOutgoingResponse extends js.Object {
  def apply(
    message: typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
}

