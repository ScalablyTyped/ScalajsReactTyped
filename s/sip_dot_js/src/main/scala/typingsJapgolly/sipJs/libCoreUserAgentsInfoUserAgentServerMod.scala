package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog
import typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsInfoUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/info-user-agent-server", "InfoUserAgentServer")
  @js.native
  open class InfoUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
