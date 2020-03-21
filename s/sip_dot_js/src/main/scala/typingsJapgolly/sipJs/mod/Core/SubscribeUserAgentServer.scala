package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SubscribeUserAgentServer")
@js.native
class SubscribeUserAgentServer protected ()
  extends typingsJapgolly.sipJs.coreMod.SubscribeUserAgentServer {
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

