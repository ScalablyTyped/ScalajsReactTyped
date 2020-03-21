package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends typingsJapgolly.sipJs.coreMod.SubscribeUserAgentClient {
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

