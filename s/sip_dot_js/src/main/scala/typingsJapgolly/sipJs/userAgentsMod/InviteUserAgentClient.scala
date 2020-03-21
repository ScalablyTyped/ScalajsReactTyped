package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends typingsJapgolly.sipJs.inviteUserAgentClientMod.InviteUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
}

