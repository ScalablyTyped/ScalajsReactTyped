package typingsJapgolly.sipJs.apiMod

import typingsJapgolly.sipJs.inviteMod.IncomingInviteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Invitation")
@js.native
class Invitation protected ()
  extends typingsJapgolly.sipJs.invitationMod.Invitation {
  /** @internal */
  def this(
    userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent,
    incomingInviteRequest: IncomingInviteRequest
  ) = this()
}

