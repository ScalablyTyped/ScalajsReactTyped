package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.userAgentClientMod.ClientTransactionConstructor
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "UserAgentClient")
@js.native
class UserAgentClient protected ()
  extends typingsJapgolly.sipJs.userAgentClientMod.UserAgentClient {
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: UserAgentCore,
    message: OutgoingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: UserAgentCore,
    message: OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}

