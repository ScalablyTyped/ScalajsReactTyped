package typingsJapgolly.sipJs.inviteMod

import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingInviteRequest extends OutgoingRequest {
  /** Delegate providing custom handling of this outgoing INVITE request. */
  @JSName("delegate")
  var delegate_OutgoingInviteRequest: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
}

