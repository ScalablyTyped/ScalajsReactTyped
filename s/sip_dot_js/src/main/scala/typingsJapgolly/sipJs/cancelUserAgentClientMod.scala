package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.userAgentClientMod.UserAgentClient
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/cancel-user-agent-client", JSImport.Namespace)
@js.native
object cancelUserAgentClientMod extends js.Object {
  @js.native
  class CancelUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
}

