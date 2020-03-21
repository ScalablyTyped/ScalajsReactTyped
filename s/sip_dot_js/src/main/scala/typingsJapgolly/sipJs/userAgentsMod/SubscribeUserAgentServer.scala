package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentServer")
@js.native
class SubscribeUserAgentServer protected ()
  extends typingsJapgolly.sipJs.subscribeUserAgentServerMod.SubscribeUserAgentServer {
  def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
  def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

