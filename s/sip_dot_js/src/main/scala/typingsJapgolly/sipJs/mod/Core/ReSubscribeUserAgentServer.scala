package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typingsJapgolly.sipJs.coreMod.ReSubscribeUserAgentServer {
  def this(
    dialog: typingsJapgolly.sipJs.dialogsMod.Dialog,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typingsJapgolly.sipJs.dialogsMod.Dialog,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

