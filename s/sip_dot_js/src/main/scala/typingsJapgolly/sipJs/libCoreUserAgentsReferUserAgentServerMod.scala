package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog
import typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore
import typingsJapgolly.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsReferUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/refer-user-agent-server", "ReferUserAgentServer")
  @js.native
  open class ReferUserAgentServer protected () extends UserAgentServer {
    /**
      * REFER UAS constructor.
      * @param dialogOrCore - Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
      * @param message - Incoming REFER request message.
      */
    def this(dialogOrCore: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
