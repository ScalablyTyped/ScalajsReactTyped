package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typingsJapgolly.sipJs.libCoreUserAgentsUserAgentServerMod.ServerTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.UserAgentServer")
@js.native
open class UserAgentServer protected ()
  extends typingsJapgolly.sipJs.libCoreMod.UserAgentServer {
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
