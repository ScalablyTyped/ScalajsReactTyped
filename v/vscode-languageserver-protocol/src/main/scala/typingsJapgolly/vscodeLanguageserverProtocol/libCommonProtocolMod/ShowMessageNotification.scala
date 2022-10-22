package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashshowMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShowMessageNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowMessageNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowMessageNotification.method")
  @js.native
  val method: windowSlashshowMessage = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowMessageNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[ShowMessageParams, Unit] = js.native
}
