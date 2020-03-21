package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ByeUserAgentServer")
@js.native
class ByeUserAgentServer protected ()
  extends typingsJapgolly.sipJs.coreMod.ByeUserAgentServer {
  def this(
    dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

