package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import typingsJapgolly.sipJs.userAgentServerMod.ServerTransactionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "UserAgentServer")
@js.native
class UserAgentServer protected ()
  extends typingsJapgolly.sipJs.userAgentServerMod.UserAgentServer {
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: UserAgentCore,
    message: IncomingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: UserAgentCore,
    message: IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

