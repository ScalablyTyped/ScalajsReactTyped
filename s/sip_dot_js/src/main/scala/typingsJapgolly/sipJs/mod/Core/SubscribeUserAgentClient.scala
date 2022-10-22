package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SubscribeUserAgentClient")
@js.native
open class SubscribeUserAgentClient protected ()
  extends typingsJapgolly.sipJs.libCoreMod.SubscribeUserAgentClient {
  def this(
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage,
    delegate: OutgoingSubscribeRequestDelegate
  ) = this()
}
