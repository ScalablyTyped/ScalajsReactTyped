package typingsJapgolly.sipJs.bodyMod

import typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typingsJapgolly.sipJs.incomingResponseMessageMod.IncomingResponseMessage
import typingsJapgolly.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/body", "getBody")
@js.native
object getBody extends js.Object {
  def apply(message: Body): js.UndefOr[Body] = js.native
  def apply(message: IncomingRequestMessage): js.UndefOr[Body] = js.native
  def apply(message: IncomingResponseMessage): js.UndefOr[Body] = js.native
  def apply(message: OutgoingRequestMessage): js.UndefOr[Body] = js.native
}

