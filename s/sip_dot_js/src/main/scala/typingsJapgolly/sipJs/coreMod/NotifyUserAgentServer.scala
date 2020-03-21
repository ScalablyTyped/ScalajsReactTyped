package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "NotifyUserAgentServer")
@js.native
class NotifyUserAgentServer protected ()
  extends typingsJapgolly.sipJs.userAgentsMod.NotifyUserAgentServer {
  /**
    * NOTIFY UAS constructor.
    * @param dialogOrCore - Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
    * @param message - Incoming NOTIFY request message.
    */
  def this(
    dialogOrCore: typingsJapgolly.sipJs.dialogsMod.Dialog,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typingsJapgolly.sipJs.dialogsMod.Dialog,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
  def this(
    dialogOrCore: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

