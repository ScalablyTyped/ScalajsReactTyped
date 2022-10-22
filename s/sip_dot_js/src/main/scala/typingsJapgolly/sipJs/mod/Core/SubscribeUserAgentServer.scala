package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SubscribeUserAgentServer")
@js.native
open class SubscribeUserAgentServer protected ()
  extends typingsJapgolly.sipJs.libCoreMod.SubscribeUserAgentServer {
  def this(
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
