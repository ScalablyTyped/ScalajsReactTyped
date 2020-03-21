package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import typingsJapgolly.sipJs.userAgentServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/invite-user-agent-server", JSImport.Namespace)
@js.native
object inviteUserAgentServerMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest because Already inherited
  - typingsJapgolly.sipJs.inviteMod.IncomingInviteRequest because var conflicts: delegate, message. Inlined  */ @js.native
  class InviteUserAgentServer protected () extends UserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    /** The confirmed dialog, if any. */
    var confirmedDialog: js.Any = js.native
    /** The early dialog, if any. */
    var earlyDialog: js.Any = js.native
  }
  
}

