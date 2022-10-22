package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.RegistrationType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotebookDocumentSyncRegistrationType {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.notebook", "NotebookDocumentSyncRegistrationType.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.notebook", "NotebookDocumentSyncRegistrationType.method")
  @js.native
  val method: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.notebook", "NotebookDocumentSyncRegistrationType.type")
  @js.native
  val `type`: RegistrationType[NotebookDocumentSyncRegistrationOptions] = js.native
}
