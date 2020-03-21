package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.bodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.getBody")
@js.native
object getBody extends js.Object {
  def apply(message: Body): js.UndefOr[Body] = js.native
  def apply(message: typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def apply(message: typingsJapgolly.sipJs.incomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[Body] = js.native
  def apply(message: typingsJapgolly.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
}

