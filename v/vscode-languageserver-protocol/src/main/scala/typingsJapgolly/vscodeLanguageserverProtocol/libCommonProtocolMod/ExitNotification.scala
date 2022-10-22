package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType0
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.exit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExitNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ExitNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ExitNotification.method")
  @js.native
  val method: exit = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ExitNotification.type")
  @js.native
  val `type`: ProtocolNotificationType0[Unit] = js.native
}
