package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.RegistrationType
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookDocumentSyncRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotebookDocumentSyncRegistrationType {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "NotebookDocumentSyncRegistrationType.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "NotebookDocumentSyncRegistrationType.method")
  @js.native
  val method: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "NotebookDocumentSyncRegistrationType.type")
  @js.native
  val `type`: RegistrationType[NotebookDocumentSyncRegistrationOptions] = js.native
}
