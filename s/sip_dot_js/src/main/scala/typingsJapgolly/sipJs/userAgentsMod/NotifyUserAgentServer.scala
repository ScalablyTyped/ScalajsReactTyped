package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.dialogsMod.Dialog
import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "NotifyUserAgentServer")
@js.native
class NotifyUserAgentServer protected ()
  extends typingsJapgolly.sipJs.notifyUserAgentServerMod.NotifyUserAgentServer {
  /**
    * NOTIFY UAS constructor.
    * @param dialogOrCore - Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
    * @param message - Incoming NOTIFY request message.
    */
  def this(dialogOrCore: Dialog, message: IncomingRequestMessage) = this()
  def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage) = this()
  def this(dialogOrCore: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

