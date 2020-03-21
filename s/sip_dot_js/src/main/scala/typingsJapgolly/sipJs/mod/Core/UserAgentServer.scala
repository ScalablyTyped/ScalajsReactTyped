package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.userAgentServerMod.ServerTransactionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.UserAgentServer")
@js.native
class UserAgentServer protected ()
  extends typingsJapgolly.sipJs.coreMod.UserAgentServer {
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

