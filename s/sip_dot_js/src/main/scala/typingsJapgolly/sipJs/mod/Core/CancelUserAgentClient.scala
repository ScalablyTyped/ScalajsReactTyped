package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.CancelUserAgentClient")
@js.native
class CancelUserAgentClient protected ()
  extends typingsJapgolly.sipJs.coreMod.CancelUserAgentClient {
  def this(
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}

