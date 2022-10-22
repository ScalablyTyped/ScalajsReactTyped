package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "PublishUserAgentClient")
@js.native
open class PublishUserAgentClient protected ()
  extends typingsJapgolly.sipJs.libCoreUserAgentsMod.PublishUserAgentClient {
  def this(
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}
