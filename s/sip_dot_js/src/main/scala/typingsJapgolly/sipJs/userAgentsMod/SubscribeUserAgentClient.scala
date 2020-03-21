package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends typingsJapgolly.sipJs.subscribeUserAgentClientMod.SubscribeUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingSubscribeRequestDelegate) = this()
}

