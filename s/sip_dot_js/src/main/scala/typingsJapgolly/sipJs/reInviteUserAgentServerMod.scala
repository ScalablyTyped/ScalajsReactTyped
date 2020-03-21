package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.dialogsMod.SessionDialog
import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.userAgentServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/re-invite-user-agent-server", JSImport.Namespace)
@js.native
object reInviteUserAgentServerMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest because Already inherited
  - typingsJapgolly.sipJs.inviteMod.IncomingInviteRequest because var conflicts: delegate, message. Inlined  */ @js.native
  class ReInviteUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    var dialog: js.Any = js.native
  }
  
}

