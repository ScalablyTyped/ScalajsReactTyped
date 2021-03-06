package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "CancelUserAgentClient")
@js.native
class CancelUserAgentClient protected ()
  extends typingsJapgolly.sipJs.cancelUserAgentClientMod.CancelUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
}

