package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReferUserAgentServer")
@js.native
class ReferUserAgentServer protected ()
  extends typingsJapgolly.sipJs.coreMod.ReferUserAgentServer {
  /**
    * REFER UAS constructor.
    * @param dialogOrCore - Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
    * @param message - Incoming REFER request message.
    */
  def this(
    dialogOrCore: typingsJapgolly.sipJs.dialogsMod.SessionDialog,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typingsJapgolly.sipJs.dialogsMod.SessionDialog,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
  def this(
    dialogOrCore: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

