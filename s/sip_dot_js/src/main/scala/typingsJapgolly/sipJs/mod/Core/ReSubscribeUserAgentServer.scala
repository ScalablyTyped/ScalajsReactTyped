package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ReSubscribeUserAgentServer")
@js.native
open class ReSubscribeUserAgentServer protected ()
  extends typingsJapgolly.sipJs.libCoreMod.ReSubscribeUserAgentServer {
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.Dialog,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.Dialog,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
