package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typingsJapgolly.sipJs.userAgentsMod.ReSubscribeUserAgentServer {
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

