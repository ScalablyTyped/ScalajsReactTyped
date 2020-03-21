package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.dialogsMod.SessionDialog
import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "PrackUserAgentServer")
@js.native
class PrackUserAgentServer protected ()
  extends typingsJapgolly.sipJs.prackUserAgentServerMod.PrackUserAgentServer {
  def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
  def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

