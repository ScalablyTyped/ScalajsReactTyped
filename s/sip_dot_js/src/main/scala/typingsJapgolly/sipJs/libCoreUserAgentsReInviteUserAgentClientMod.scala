package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog
import typingsJapgolly.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import typingsJapgolly.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsReInviteUserAgentClientMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequest because Already inherited
  - typingsJapgolly.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest because var conflicts: delegate, message. Inlined  */ @JSImport("sip.js/lib/core/user-agents/re-invite-user-agent-client", "ReInviteUserAgentClient")
  @js.native
  open class ReInviteUserAgentClient protected () extends UserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate, options: RequestOptions) = this()
    
    @JSName("delegate")
    var delegate_ReInviteUserAgentClient: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
    
    /* private */ var dialog: Any = js.native
  }
}
