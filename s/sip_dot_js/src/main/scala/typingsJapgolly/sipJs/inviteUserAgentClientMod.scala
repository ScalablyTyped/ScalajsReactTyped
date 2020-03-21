package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.userAgentClientMod.UserAgentClient
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/invite-user-agent-client", JSImport.Namespace)
@js.native
object inviteUserAgentClientMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequest because Already inherited
  - typingsJapgolly.sipJs.inviteMod.OutgoingInviteRequest because var conflicts: delegate, message. Inlined  */ @js.native
  class InviteUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
    var confirmedDialogAcks: js.Any = js.native
    var confirmedDialogs: js.Any = js.native
    @JSName("delegate")
    var delegate_InviteUserAgentClient: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
    var earlyDialogs: js.Any = js.native
  }
  
}

