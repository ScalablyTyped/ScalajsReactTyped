package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidClose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidCloseTextDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidCloseTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidCloseTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidClose = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidCloseTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidCloseTextDocumentParams, TextDocumentRegistrationOptions] = js.native
}
