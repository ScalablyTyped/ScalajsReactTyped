package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SubscribeUserAgentServer")
@js.native
class SubscribeUserAgentServer protected ()
  extends typingsJapgolly.sipJs.userAgentsMod.SubscribeUserAgentServer {
  def this(
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

