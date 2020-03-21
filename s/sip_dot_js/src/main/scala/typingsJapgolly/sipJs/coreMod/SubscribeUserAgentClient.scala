package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends typingsJapgolly.sipJs.userAgentsMod.SubscribeUserAgentClient {
  def this(
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingSubscribeRequestDelegate
  ) = this()
}

